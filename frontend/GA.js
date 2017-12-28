function generate_actions() {
	var list_events = [ "--Select--", "Mouse", "Keyboard", "Browser", "JavaScript" , "Screenshot"  , "Validate" , "Database" , "Window", "Tab" , "Alert" , "WebService" , "Wait" , "Dropdown_Select"];
	var select = [ "--Select--" ];
	var selectors = [ "--Select--" , "id" , "xpath" , "Css" , "name" , "Tag" , "LinkText" , "PartialLinkText" , "ClassName"];

	var arr = [];
	var arr1 = [];

	var a = parseInt(document.getElementById("count_actions").value);
	if (a != null) {
		arr.length = a;
		arr1.length = a;
		var add_attr = [];
		add_attr.length = arr.length;

		var add_attr1 = [];
		add_attr1.length = arr.length;
		action_form = document.createElement('FORM');
		action_form.name = 'action_form';
		action_form.id = 'action_form';

		action_form.method = 'POST';

	}
	var div_ch = document.getElementById("div_ch");
	div_ch.innerHTML = "";
	div_ch.appendChild(document.createTextNode('EVENTS'));
	div_ch.appendChild(document.createTextNode('SUB-EVENTS'));
	div_ch.appendChild(document.createTextNode('WEB-ELEMENT'));
	div_ch.appendChild(document.createTextNode('DURATION'));

	for ( var j = 0; j < a; j++) {

		my_tb1 = document.createElement("select");
		my_tb2 = document.createElement("select");
		selector = document.createElement("select");
		my_tb3 = document.createElement('INPUT');
		my_tb4 = document.createElement('INPUT');
		my_tb5 = document.createElement('INPUT');

		my_tb1.name = "1" + j;
		my_tb2.name = "2" + j;
		my_tb3.name = "4" + j;
		my_tb4.name = "5" + j;
		selector.name = "3" + j;
		my_tb5.name = "6" + j;
		my_tb1.id = "1" + j;
		my_tb2.id = "2" + j;
		my_tb3.id = "4" + j;
		my_tb4.id = "5" + j;
				my_tb5.id = "6" + j;
		selector.id = "3" + j;
		arr[j] = "1" + j;
		arr1[j] = "2" + j;

		action_form.appendChild(my_tb1);
		action_form.appendChild(document.createTextNode(" "));
		action_form.appendChild(my_tb2);
		action_form.appendChild(document.createTextNode(" "));
		action_form.appendChild(selector);
		action_form.appendChild(document.createTextNode(" "))
		action_form.appendChild(my_tb3);
		action_form.appendChild(document.createTextNode(" "));
		action_form.appendChild(my_tb4);
		action_form.appendChild(document.createTextNode(" "));
		action_form.appendChild(my_tb5);
		action_form.appendChild(document.createTextNode(" "));
		action_form.appendChild(document.createElement("br"));

		div_ch.appendChild(action_form);
		for ( var i = 0; i < list_events.length; i++) {
			var option = document.createElement("option");
			option.value = list_events[i];
			option.text = list_events[i];
			my_tb1.appendChild(option);
		}

for ( var i = 0; i < selectors.length; i++) {
			var option = document.createElement("option");
			option.value = selectors[i];
			option.text = selectors[i];
			selector.appendChild(option);
		}

		var option = document.createElement("option");
		option.value = select[0];
		option.text = select[0];
		my_tb2.appendChild(option);

	}

	for ( var i = 0; i < arr.length; i++) {

		add_attr[i] = document.getElementById(arr[i])
		add_attr1[i] = document.getElementById(arr1[i])
		add_attr[i].addEventListener('change', function() {

			id2 = parseInt(this.id) + 10;
			process_data(this.id, id2);
		}, false);

	}

	var formData1 = JSON.stringify($("#action_form").serializeArray());

}

function process_data(data, data2) {
		var list_events = [ "--Select--", "Mouse", "Keyboard", "Browser", "JavaScript" , "Screenshot"  , "Validate" , "Database" , "Window", "Tab" , "Alert" , "WebService" , "Wait" , "Dropdown_Select"];

	var Mouse = [ "--Select--", "Click", "DodubleClick", "ClickandHold" , "ContextClick", "DragDrop" ,  "Hover" ];
	var Keyboard = [ "--Select--", "write_text" ];
	var Browser = [ "--Select--", "GotoURL", "Maximize"  ,"Refresh", "Close" ];
	var JavaScript = [ "--Select--", "Click", "EnterData", "DodubleClick" , "ClickandHold" , "ContextClick", "DragDrop" ,  "Hover"];
	var Screenshot = [ "--Select--", "Type" ];
	var Validate = [ "--Select--", "validateandhalt", "ValidateandContinue"];
	var Database = [ "--Select--", "ExecuteQuery"];
	var Window = [ "--Select--", "switchtoWindow", "GetOpenWindows" ];
	var Tab = [ "--Select--", "switchtoTab" ];
	var Alert = [ "--Select--", "Acceptalert", "CancelAlert" ];
	var Frames = [ "--Select--", "Switchttoframe" ];
	var WebService = [ "--Select--", "REST" , "SOAP" ];
	var Wait = [ "--Select--", "ExplicitWait" , "ImplicitWait" , "FluentWait"];
	var Dropdown_Select = [ "--Select--", "ById" , "ByValue" , "FluentWait"];


	
	ele = document.getElementById(data)
	ele1 = document.getElementById(data2)

	var size = ele1.length;
	for ( var l = 0; l < size; l++) {
		ele1.remove(0);
	}

	switch (ele.value) {
	case "Mouse": {
		for ( var k = 0; k < Mouse.length; k++) {
			var option = document.createElement("option");
			option.value = Mouse[k];
			option.text = Mouse[k];
			ele1.appendChild(option);
		}
	}
	break;
	case "Keyboard": {
		for ( var k = 0; k < Keyboard.length; k++) {
			var option = document.createElement("option");
			option.value = Keyboard[k];
			option.text = Keyboard[k];
			ele1.appendChild(option);
		}
	}
	break;
	case "Browser": {
		for ( var k = 0; k < Browser.length; k++) {
			var option = document.createElement("option");
			option.value = Browser[k];
			option.text = Browser[k];
			ele1.appendChild(option);
		}
}
break;
case "JavaScript": {
		for ( var k = 0; k < JavaScript.length; k++) {
			var option = document.createElement("option");
			option.value = JavaScript[k];
			option.text = JavaScript[k];
			ele1.appendChild(option);
		}
}
break;
case "Screenshot": {
		for ( var k = 0; k < Screenshot.length; k++) {
			var option = document.createElement("option");
			option.value = Screenshot[k];
			option.text = Screenshot[k];
			ele1.appendChild(option);
		}
}
break;
case "Frames": {
		for ( var k = 0; k < Frames.length; k++) {
			var option = document.createElement("option");
			option.value = Frames[k];
			option.text = Frames[k];
			ele1.appendChild(option);
		}
}
break;
case "Alert": {
		for ( var k = 0; k < Alert.length; k++) {
			var option = document.createElement("option");
			option.value = Alert[k];
			option.text = Alert[k];
			ele1.appendChild(option);
		}
}
break;
case "Validate": {
		for ( var k = 0; k < Validate.length; k++) {
			var option = document.createElement("option");
			option.value = Validate[k];
			option.text = Validate[k];
			ele1.appendChild(option);
		}
}
break;
case "Database": {
		for ( var k = 0; k < Database.length; k++) {
			var option = document.createElement("option");
			option.value = Database[k];
			option.text = Database[k];
			ele1.appendChild(option);
		}
}
break;
case "Window": {
		for ( var k = 0; k < Window.length; k++) {
			var option = document.createElement("option");
			option.value = Window[k];
			option.text = Window[k];
			ele1.appendChild(option);
		}
}
break;
case "Tab": {
		for ( var k = 0; k < Tab.length; k++) {
			var option = document.createElement("option");
			option.value = Tab[k];
			option.text = Tab[k];
			ele1.appendChild(option);
		}
	}
	break;
case "WebService": {
		for ( var k = 0; k < WebService.length; k++) {
			var option = document.createElement("option");
			option.value = WebService[k];
			option.text = WebService[k];
			ele1.appendChild(option);
		}
	}
	break;
	case "Wait": {
		for ( var k = 0; k < Wait.length; k++) {
			var option = document.createElement("option");
			option.value = Wait[k];
			option.text = Wait[k];
			ele1.appendChild(option);
		}
	}
	break;
	default:
		var option = document.createElement("option");
			option.value = "--Select--";
			option.text = "--Select--";
			ele1.appendChild(option);
	}
}

function generate_text_box(data) {
	var div_ch1 = document.getElementById('div_ch1');
	if (data == 'Code' || data == 'Both') {

		while (div_ch1.hasChildNodes()) {
			div_ch1.removeChild(div_ch1.lastChild);
		}

		

		in1 = document.createElement('INPUT');
		in2 = document.createElement('INPUT');

		in1.name = "class_name";
		in1.id = "class_name";

		in2.name = "method_name";
		in2.id = "method_name";

		div_ch1.appendChild(document.createTextNode('Class Path'));
		div_ch1.appendChild(in1);
		div_ch1.appendChild( document.createTextNode( '\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0' ) );
		div_ch1.appendChild(document.createTextNode('Method Name'));
		div_ch1.appendChild(in2);
		//div_ch1.appendChild(ac_form);

	} else {
		while (div_ch1.hasChildNodes()) {
			div_ch1.removeChild(div_ch1.lastChild);
		}
	}
}