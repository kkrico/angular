var App = angular.module('controllers', []);

App.controller('AgenteCtrl', function($scope, AgenteService, $route, $routeParams, $location){
	
	debugger;
	$scope.agente = [];
	$scope.notFound = false;
	AgenteService.list().then(function(data){
		$scope.agente = data.data;
		if(data.data.length == 0){
			$scope.notFound = true;
		}
	},function(data){
		console.log("data", data);
	});

	$scope.deletar = function(id){
		AgenteService.delete(id).then(function(data){
			console.log(data);
			$route.reload();
		});	
	}
	
	
	$scope.editar = function() {
		debugger;
		var id = $routeParams.id;
		AgenteService.profile(id).then(function(data){
			$scope.item = data.data;
			$route.reload();
		});
	}
});	


//App.controller('EditAgentCtrl', function($scope, AgenteService, $routeParams, $location){
	
//});	
