function send_data() {
	if(document.getElementById('type_e').value == "--Select--")
	{
	alert("Please Select Type of Execution")
	document.getElementById('type_e').focus()
	}
	else {
	var formData = JSON.stringify($("#main_form").serializeArray());
	formData = formData + JSON.stringify($("#action_form").serializeArray());

	$.ajax({
		type : "POST",
		url : "http://localhost:8080/Sel_project_AI/Selenium",
		data : formData,
		success : function(data) {
			console.log(data);
		},
		dataType : "json",
		contentType : "application/json"
	});
	}
}