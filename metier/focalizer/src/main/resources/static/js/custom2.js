function showLocationOnMap (location) {
    var map;
    map = new google.maps.Map(document.getElementById('map'), {
      center: {
        lat: Number(location.latitude), 
        lng: Number(location.longitude)},
        zoom: 15
    });
    var marker = new google.maps.Marker({
      position: {
        lat: Number(location.latitude), 
        lng: Number(location.longitude)},
        map: map,
        title: 
          "Public IP:"+location.ipAddress
            +" @ "+location.city
    });   
}