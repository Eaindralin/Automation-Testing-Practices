<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_JavaScript Events        katalonfont-f_766822</name>
   <tag></tag>
   <elementGuidId>f2568317-403f-4c82-9526-2a7457a9ef12</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//*/text()[normalize-space(.)='']/parent::*</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>html</value>
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
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    JavaScript Events
    

    

#katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}






    
        Index
    

    JavaScript Events

    
        Not all buttons are based around 'click' events. We might encounter
            systems based around 'blur' or 'mousedown' or a whole host of other
            &quot;it made sense at the time&quot; or &quot;because on this device...&quot;. So we have
            to learn how to handle different events.
        
        Each of the buttons has a different triggering event, try to trigger them.
    

    

        
            function triggeredEvent(thang){
                var myid= thang.getAttribute(&quot;id&quot;);
                document.getElementById(myid + &quot;status&quot;).innerHTML=&quot;Event Triggered&quot;;
                thang.className=&quot;styled-click-button-triggered&quot;;
            }
        

        
            OnBlur
            Event Triggered
        

        
            OnClick
            Event Triggered
        

        
            OnContextMenu
            Event Triggered
        

        
            OnDoubleClick
            Event Triggered
        

        
            OnFocus
            Event Triggered
        

        
            OnKeyDown
            Event Triggered
        

        
            OnKeyUp
            Event Triggered
        

        
            OnKeyPress
            Event Triggered
        

        
            OnMouseOver
            Event Triggered
        

        
            OnMouseLeave
            Event Triggered
        

        
            OnMouseDown
            Event Triggered
        
    


    
        EvilTester.com,
            Compendium Developments
    






/html[1]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]</value>
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
