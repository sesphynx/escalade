$( "#ipForm" ).submit(function( event ) {
    event.preventDefault();
    $.ajax({
        url: "GeoIPTest",
        type: "POST",
        contentType: 
         "application/x-www-form-urlencoded; charset=UTF-8", 
        data: $.param( {ipAddress : $("#ip").val()} ),
        complete: function(data) {},
        success: function(data) {
            $("#status").html(JSON.stringify(data));
            if (data.ipAddress !=null) {
                showLocationOnMap(data);
            }
        },
        error: function(err) {
            $("#status").html("Error:"+JSON.stringify(data));
            },
        });
});

