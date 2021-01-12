package controller;

import controller.action.Action;
import controller.action.GetRestaurants;
import controller.action.GetSpecifics;
import controller.action.MainPage;
import controller.action.RestaurantDelete;
import controller.action.RestaurantInsert;
import controller.action.RestaurantUpdate;
import controller.action.RestaurantUpdateReq;
import controller.action.RestaurantgetAll;

public class ActionFactory {

	private static ActionFactory instance = new ActionFactory();
	private ActionFactory(){}
	public static ActionFactory getInstance(){
		return instance;
	}
	public Action getAction(String command){
		Action action = null;
				
		if(command.equals("restaurantgetAll")){
			action = new RestaurantgetAll();
		}else if(command.equals("restaurantUpdate")){
			action = new RestaurantUpdate();
		}else if(command.equals("restaurantUpdateReq")){
			action = new RestaurantUpdateReq();
		}else if(command.equals("restaurantInsert")){
			action = new RestaurantInsert();
		}else if(command.equals("restaurantDelete")){
			action = new RestaurantDelete();
		}else if(command.equals("getSpecifics")){
			action = new GetSpecifics();
		}else if(command.equals("getRestaurants")){
			action = new GetRestaurants();
		}else if(command.equals("main")){
			action = new MainPage();
		}
		return action;
	}
}

