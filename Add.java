package com.aop;
class Add<T>{
	int count=0;
	int i;int size=100;
	@SuppressWarnings("unchecked")
	T[] element=(T[])new Object[size];
	Add(){
		
	}
	void add(T ob){
		if(count<size){
			element[count]=ob;
		}
		else
		{

		T item[]=(T[])new Object[count+1];
		for(i=0;i<=count;i++){
			item[i]=element[i];}
			item[i]=ob;
			count++;
		}
		System.out.print(ob+" ");
	}
			public static void main(String[] args){
				System.out.print("Insert element is:");
		    Add a=new Add();
			a.add("kk");
			a.add(4);
			a.add(20);
			a.add(56);
			
			}
}
		
	
	
	