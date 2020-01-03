<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Search Summons                         _c95f6d</name>
   <tag></tag>
   <elementGuidId>5d17000e-9c81-49bc-b17c-2fb8a91f5876</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>content</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
            

    
            
            
                
      
    
        Search Summons
        
                 
            
                
 



 






                  NRIC No.
                   Passport No.
                Company Registration No.
               Vehicle  No.




                
            
            
                
                    Passport No.:
                    
                
                
                
                
                    Company Registration No.:
                    
                
                
                
                
                    Vehicle Plate Type:   
                    
                    
                   
                       Malaysia     Non Malaysia
                  
                   
                    
                    
                    Vehicle  No.:
                    
                
                
                
             
                
                    NRIC No.:
                   

                
                
            
            
                            
			
			
            
			
			
			
			
			
            
            	 
            	Type the text shown above:
            	
            	
				  
 
		         
				 
            
            
			
			
            
                
            
            
            	
            
        
    
        
    
   	
    
            
            
        
    

            

today  = new Date();
todayEpoch  = today.getTime();

target = new Date(&quot;28 February, 2011&quot;); 
targetEpoch = target.getTime();

daysLeft = Math.floor(((targetEpoch - todayEpoch) / (60*60*24)) / 1000);


   

	 
      
        
        
		
			
			
			Announcement
			
				1.NEW:Singapore citizens can now pay their summons online via credit card.
				2.Due to high traffic on PDRM servers, you may still see your paid summons on our website.
				3.Please be informed that it may take up to 48 hours for transaction(s) to be updated on PDRM servers.
				
				4.Your receipt is recognized by PDRM as proof of payment and you will not be penalised if summons status has yet to be updated on PDRM servers.
			
		
		
        

    
    



        

        
        	



    
	
	
    Search Receipt
    
            If your successful transaction is not found in the Transaction history below, please search here by providing required details.
	   
 	

		
			
				        			
				      
    ID No.
    Order No.




		         	 
        		
        	 
        	 	        
				         
	         				
								 NRIC/Passport/Company Reg No.
								
								Vehicle No. 
								
	 							 	 	 
	 						
	 						
								 Summons ID :
								
	 						
	 		
					 		
						 		Order No.
								
					 		
 						        	 
 				
				 
					
			
		
		
			
		  
		
 
 	 	 
    
                   
            	





 
 
 
            Transaction History
                                                 
              No record found.
            
        
        
	

	
	
	
	
	
	
	
	
	
	
	
		


   
       
        	 				
							 
							 
							 
							 
    
    


 // check summons form submit event 
          $('input[name=btn_chksummons]:first').unbind().click (function(e) 
           {		var isInputOK =  true; 
           			var message ='-';	
           			var  sel_value = $('#sel_searchType').val();
           		              $('div#message').html('&amp;nbsp;');
           		              
           			switch(sel_value) {
                        	case 'id_no':
              						 if ($('input#idNo').val() =='' || $('input#vehNo').val() =='')
              						 {
              						 	message  += 'ID No. and Vehicle No. are required.';
              						 	isInputOK = false;
              						 }
                          	 break;
                        	case 'summons_id':
                        			 if ($('input#summonsID').val() =='')
              						 {
              						 	message  += 'Summons ID required';
              							isInputOK = false;
              						 	
              						 }
                          	break;
                       		case 'merchant_id':
      								if ($('input#merchantID').val() =='')
              						 {
              						 	message  += 'Order No. is required';
              						 	isInputOK = false;
              						 }
                          	break;   
                          case 'veh_no':
      								if ($('input#vehNo').val() =='')
              						 {
              						 	message  += 'Vehicle No. required';

              						 	isInputOK = false;
              						 }
                          	break;               
                    	}
           			 
 				//	if (  $('input#txDate').val() == ''   ){
                 //   	  message  +=  '- Transaction Date required.\n';
                  //  	  isInputOK = false;
                  //  } 
					 
           			 if (!isInputOK){
           				//$('div#message').html( ' 	&lt;font style=\&quot;color: red;font-weight: bolder;\&quot;>' + message  +'&lt;/font>');
           				// alert  ( message ) ;

           				new Messi( message , {title: 'Notice:'});
           				
           			}else{
           			 	$('form#searchReceipt').attr('method', 'post').attr('action',  context_path +  '/reg/q.do').submit();
           			}               
            });   
	    
	    

	
        
        
    </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;content&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='content']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='main']/div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='MyEG » PDRM » Summons Service » Enquiry'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Summons Service'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div[2]</value>
   </webElementXpaths>
</WebElementEntity>
