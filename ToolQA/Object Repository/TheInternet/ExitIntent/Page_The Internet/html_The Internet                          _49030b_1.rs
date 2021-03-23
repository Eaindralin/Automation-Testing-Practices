<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_The Internet                          _49030b_1</name>
   <tag></tag>
   <elementGuidId>82061881-2cae-4d2f-8d86-6cf94924b3c2</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>html.no-js</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//*/text()[normalize-space(.)='']/parent::*</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>no-js</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>lang</name>
      <type>Main</type>
      <value>en</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
    
    
    The Internet
    
    
    
    
    
    
    
      $(document).foundation();
    
  #katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}
  
    
      
      
        
      
        
      
        
      
      
    
    
      
      
        

  Exit Intent
  Mouse out of the viewport pane and see a modal window appear.



  
  
    
      This is a modal window
    

    
      It's commonly used to encourage a user to take an action (e.g., give their e-mail address to sign up for something). 
    

    
      Close
    
  



var _ouibounce = ouibounce(document.getElementById('ouibounce-modal'), {
  aggressive: true,
  timer: 0,
  callback: function() {
    console.log('ouibounce fired!');
    $('#page-footer').hide();
  }
});
$('body').on('click', function() {
  $('#ouibounce-modal').hide();
  $('#page-footer').show();
});
$('#ouibounce-modal .modal-footer').on('click', function() {
  $('#ouibounce-modal').hide();
  $('#page-footer').show();
});
$('#ouibounce-modal .modal').on('click', function(e) {
  e.stopPropagation();
});


#ouibounce-modal {
  font-family: 'Open Sans', sans-serif;
  display: none;
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
}
#ouibounce-modal .underlay {
  width: 100%;
  height: 100%;
  position: absolute;
  top: 0;
  left: 0;
  background-color: rgba(0,0,0,0.5);
  cursor: pointer;
  -webkit-animation: fadein 0.5s;
  animation: fadein 0.5s;
}
#ouibounce-modal .modal {
  width: 600px;
  height: 400px;
  background-color: #f0f1f2;
  z-index: 1;
  position: absolute;
  margin: auto;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  border-radius: 4px;
  -webkit-animation: popin 0.3s;
  animation: popin 0.3s;
}
#ouibounce-modal .modal-title {
  font-size: 18px;
  background-color: #252525;
  color: #fff;
  padding: 10px;
  margin: 0;
  border-radius: 4px 4px 0 0;
  text-align: center;
}
#ouibounce-modal h3 {
  color: #fff;
  font-size: 1em;
  margin: 0.2em;
  text-transform: uppercase;
  font-weight: 500;
}
#ouibounce-modal .modal-body {
  padding: 20px 35px;
  font-size: 0.9em;
}
#ouibounce-modal p {
  color: #344a5f;
}
#ouibounce-modal form {
  text-align: center;
  margin-top: 35px;
}
#ouibounce-modal form input[type=text] {
  padding: 12px;
  font-size: 1.2em;
  width: 300px;
  border-radius: 4px;
  border: 1px solid #ccc;
  -webkit-font-smoothing: antialiased;
}
#ouibounce-modal form input[type=submit] {
  text-transform: uppercase;
  font-weight: bold;
  padding: 12px;
  font-size: 1.1em;
  border-radius: 4px;
  color: #fff;
  background-color: #4ab471;
  border: none;
  cursor: pointer;
  -webkit-font-smoothing: antialiased;
}
#ouibounce-modal form p {
  text-align: left;
  margin-left: 35px;
  opacity: 0.8;
  margin-top: 1px;
  padding-top: 1px;
  font-size: 0.9em;
}
#ouibounce-modal .modal-footer {
  position: absolute;
  bottom: 20px;
  text-align: center;
  width: 100%;
}
#ouibounce-modal .modal-footer p {
  text-transform: capitalize;
  cursor: pointer;
  display: inline;
  border-bottom: 1px solid #344a5f;
}
@-webkit-keyframes fadein {
  0% {
    opacity: 0;
  }

  100% {
    opacity: 1;
  }
}
@-ms-keyframes fadein {
  0% {
    opacity: 0;
  }

  100% {
    opacity: 1;
  }
}
@keyframes fadein {
  0% {
    opacity: 0;
  }

  100% {
    opacity: 1;
  }
}
@-webkit-keyframes popin {
  0% {
    -webkit-transform: scale(0);
    transform: scale(0);
    opacity: 0;
  }

  85% {
    -webkit-transform: scale(1.05);
    transform: scale(1.05);
    opacity: 1;
  }

  100% {
    -webkit-transform: scale(1);
    transform: scale(1);
    opacity: 1;
  }
}
@-ms-keyframes popin {
  0% {
    -ms-transform: scale(0);
    transform: scale(0);
    opacity: 0;
  }

  85% {
    -ms-transform: scale(1.05);
    transform: scale(1.05);
    opacity: 1;
  }

  100% {
    -ms-transform: scale(1);
    transform: scale(1);
    opacity: 1;
  }
}
@keyframes popin {
  0% {
    -webkit-transform: scale(0);
    -ms-transform: scale(0);
    transform: scale(0);
    opacity: 0;
  }

  85% {
    -webkit-transform: scale(1.05);
    -ms-transform: scale(1.05);
    transform: scale(1.05);
    opacity: 1;
  }

  100% {
    -webkit-transform: scale(1);
    -ms-transform: scale(1);
    transform: scale(1);
    opacity: 1;
  }
}


      
    
    
      
        
        Powered by Elemental Selenium
      
    
  

/html[@class=&quot;no-js&quot;]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;no-js&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>//*/text()[normalize-space(.)='']/parent::*</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//html</value>
   </webElementXpaths>
</WebElementEntity>
