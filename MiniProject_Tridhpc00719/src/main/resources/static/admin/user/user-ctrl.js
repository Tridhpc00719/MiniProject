app.controller("user-ctrl", function($scope, $http) {
	$scope.items = [];
	$scope.cates = [];
	$scope.form = {};

	$scope.initialize = function() {
		//load account
		$http.get("/rest/account").then(resp => {
			$scope.items = resp.data;

			$scope.items.forEach(item => {
				item.createDate = new Date(item.createDate)
			});

		});
		//load categories
		$http.get("/rest/categories").then(resp => {
			$scope.cates = resp.data;

		});
	}
	$scope.initialize();

	$scope.reset = function() {
		$scope.form = {
			photo: 'cloud-upload.jpg',
			available: true,

		}
	}
	$scope.reset();

	$scope.edit = function(item) {
		$scope.form = angular.copy(item);
		$(".nav-tabs a:eq(0)").tab('show')
	}

	$scope.create = function() {
		var item = angular.copy($scope.form);
		$http.post(`/rest/account`, item).then(resp => {
			$scope.items.push(resp.data);
			$scope.reset();
			alert("Add user successfully")
		}).catch(error => {
			alert("Add user failed!")
			console.log("Error", error);
		})
	}

	$scope.update = function() {
		var item = angular.copy($scope.form);
		$http.put(`/rest/account/${item.username}`, item).then(resp => {
			var index = $scope.items.findIndex(p => p.username == item.username);
			$scope.items[index] = item;
			alert("User " + item.username + " update successfully!")
		}).catch(error => {
			alert("User update failed!")
			console.log("Error", error);
		})
	}

	$scope.delete = function(item) {

		$http.delete(`/rest/account/delete/${item.username}`).then(resp => {
			var index = $scope.items.findIndex(p => p.username == item.username);
			$scope.items.splice(index, 1);
			$scope.reset();
			alert("Delete user successfully!")
		}).catch(error => {
			alert("Delete user failed!")
			console.log("Error", error);
		})
	}

	$scope.imageChanged = function(files) {
		var data = new FormData();
		data.append('file', files[0]);
		$http.post('/rest/upload/images', data, {
			TransformRequest: angular.identity,
			headers: { 'Content-Type': undefined }
		}).then(resp => {
			$scope.form.photo = resp.data.name;

		}).catch(error => {
			alert("Error loading image");
			console.log("Error", error);
		})
	}
	// Phân trang
	$scope.pager = {
		page: 0,
		size: 10,
		get items() {
			var start = this.page * this.size;
			return $scope.items.slice(start, start + this.size);
		},
		get count() {
			return Math.ceil(1.0 * $scope.items.length / this.size)
		},
		first() {
			this.page = 0;
		},
		prev() {
			this.page--;
		},
		next() {
			this.page++;
		},
		last() {
			this.page = this.count - 1;
		}

	}
})