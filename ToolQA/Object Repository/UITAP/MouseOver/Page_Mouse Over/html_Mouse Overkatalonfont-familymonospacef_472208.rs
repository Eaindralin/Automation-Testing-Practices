<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_Mouse Overkatalonfont-familymonospacef_472208</name>
   <tag></tag>
   <elementGuidId>2ffa2b33-444f-4c30-83b2-ab600bdc326d</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>html</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//html</value>
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
      <name>lang</name>
      <type>Main</type>
      <value>en</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>Mouse Over#katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}UITAPHomeResourcesMouse OverPlacing mouse over an element may lead to changes in the DOM tree. For example the  element may be modified or replaced. It means if you keep a reference to the original element and will try to click on it - it may not work.This puzzle complicates both recording and playback of a test.ScenarioRecord 2 consecutive link clicks.Execute the test and make sure that click count is increasing by 2.PlaygroundClick meThe link clicked 0 times.function linkActive(el)
{ 
    var newEl = el.cloneNode(true);
    newEl.setAttribute(&quot;title&quot;, &quot;Active Link&quot;);
    newEl.setAttribute(&quot;onmouseenter&quot;, &quot;&quot;);
    newEl.setAttribute(&quot;onmouseleave&quot;, &quot;linkInactive(this)&quot;);
    newEl.setAttribute(&quot;onclick&quot;, &quot;linkClicked(this)&quot;)
    newEl.setAttribute(&quot;class&quot;, &quot;text-warning&quot;);

    var parentNode = el.parentNode;
    parentNode.removeChild(el);
    parentNode.appendChild(newEl);
} 

function linkInactive(el)
{
    var newEl = el.cloneNode(true);
    newEl.setAttribute(&quot;title&quot;, el.innerText);
    newEl.setAttribute(&quot;onmouseenter&quot;, &quot;linkActive(this)&quot;);
    newEl.setAttribute(&quot;onmouseleave&quot;, &quot;&quot;);
    newEl.setAttribute(&quot;onclick&quot;, &quot;&quot;)
    newEl.setAttribute(&quot;class&quot;, &quot;text-primary&quot;);

    var parentNode = el.parentNode;
    parentNode.removeChild(el);
    parentNode.appendChild(newEl);
}

function linkClicked(el)
{
    var title = el.getAttribute(&quot;title&quot;);
    
    var badge = document.getElementById(&quot;clickCount&quot;);
    badge.innerText = parseInt(badge.innerText) + 1;
}


    
        
            
                
            
            
                Fork the website on GitHub.
            
        Supported by Rapise test automation team. Copyright © 2020 Inflectra Corporation.
        
        
            This work is licensed under the Apache License 2.0.
        
    








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
      <name>xpath:position</name>
      <type>Main</type>
      <value>//html</value>
   </webElementXpaths>
</WebElementEntity>
