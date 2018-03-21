'use strict'

var lawCollage = angular.module('lawCollage', [ 'ui.bootstrap', 'lawCollage.controllers',
		'lawCollage.services' ]);
lawCollage.constant("CONSTANTS", {
	getUserByIdUrl : "/user/getUser/",
	getAllUsers : "/user/getAllUsers",
	saveUser : "/user/saveUser"
});