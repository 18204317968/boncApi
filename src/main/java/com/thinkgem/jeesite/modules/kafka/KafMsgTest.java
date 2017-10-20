package com.thinkgem.jeesite.modules.kafka;



public class KafMsgTest {  
	  
    public static void main(String[] args) {  
    	 
        	 System.out.println("kafka.............start");
        	 KafMsgTest kfk=new KafMsgTest();
        	 kfk.doShutdownHook();
    		 KafkaConsumer consumerThread1 = new KafkaConsumer("news"); 
    		 KafkaConsumer consumerThread2 = new KafkaConsumer("soc"); 
             consumerThread1.start();
             consumerThread2.start();
    	 }
          
         private void doShutdownHook(){
        	 Runtime.getRuntime().addShutdownHook(new Thread(){
        		 public void run(){
        			 try{
        				 if(null!=CreateHDFS.newsOutputStream){
        					 CreateHDFS.newsOutputStream.close();
        					 CreateHDFS.newsHdfs.close();
        				 }
        				 if(null!=CreateHDFS.socOutputStream){
        					 CreateHDFS.socOutputStream.close();
        					 CreateHDFS.socHdfs.close();
        				 }
        				 System.out.println("end");
        			 }catch(Exception e){
        				 e.printStackTrace();
        			 }
        		 }
        	 });
         }
    
}  
