package com.Java8UdemyCourse.Section8.PolymorphismChallenge;


	
	public class Ford extends Cars {
		
		public Ford(int cylinders, String name){
			super(cylinders, name);
		}

		
		public  String startEngine() {
			// TODO Auto-generated method stub
			return " Ford -> Start Engine ";
		}

		
		public  String accelerate() {
			// TODO Auto-generated method stub
			return " Ford -> Accelerate";
		}

		
		public  String brake() {
			// TODO Auto-generated method stub
			return " Ford -> Break ";
		}
		
		
		
		}


