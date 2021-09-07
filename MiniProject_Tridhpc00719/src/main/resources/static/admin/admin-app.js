app = angular.module("admin-app", ["ngRoute"]);

app.config(function($routeProvider) {
	$routeProvider
		.when("/products", {
			templateUrl: "/admin/product/index.html",
			controller: "product-ctrl"
		})
		
		.when("/account", {
			templateUrl: "/admin/account/index.html",
			controller: "account-ctrl"
		})
		
		.when("/user", {
			templateUrl: "/admin/user/index.html",
			controller: "user-ctrl"
		})

		.when("/authorize", {
			templateUrl: "/admin/authority/index.html",
			controller: "authority-ctrl"
		})
		.when("/unauthorized", {
			templateUrl: "/admin/authority/unauthorized.html",
			controller: "authority-ctrl"
		})
		.otherwise({
			templateUrl: "/admin/account/index.html",
			controller: "account-ctrl"
		});
		
});