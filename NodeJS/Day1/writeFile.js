let fs=require('fs');

var name = "prasad";
var age = 30
var user = {
  "name": name,
  "age": age
}

fs.readFile('users.json', function (err, data) {
    if(err){
        console.log('Error while reading data');
    }else{
    var json = JSON.parse(data)
    console.log("output :::: "+json);
    json.push( user);

    fs.writeFile("users.json", JSON.stringify(json), function(err){
        if (err) 
         console.log('Error while reading data');
        else
        console.log('The "data to append" was appended to file!');
      });
  }
})