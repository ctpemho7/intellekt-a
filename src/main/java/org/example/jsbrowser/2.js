function displayBrowserInfo() {
    let userAgent = navigator.userAgent;
    var resolution = screen.width + "x" + screen.height;
    let browserName;

    if(userAgent.match(/chrome|chromium|crios/i)){
               browserName = "Chrome";
             }else if(userAgent.match(/firefox|fxios/i)){
               browserName = "Firefox";
             }  else if(userAgent.match(/safari/i)){
               browserName = "Safari";
             }else if(userAgent.match(/opr\//i)){
               browserName = "Opera";
             } else if(userAgent.match(/edg/i)){
               browserName = "Edge";
             }else{
               browserName="No browser detection";
             }

  var message = "You are using " + browserName + " with screen resolution: " + resolution + ".";
  alert(message);
}

displayBrowserInfo();
