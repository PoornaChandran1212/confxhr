var app = new function () {
    var result;
    var countries;
    

    var mode = "";
    var updateidx;

    

    this.getAllCountries = function () {
        countries = {};
        var xhr = new XMLHttpRequest();
        xhr.onreadystatechange = function () {
            if (xhr.readyState == XMLHttpRequest.DONE) {
                if(xhr.responseText.length>0){
                countries = JSON.parse(xhr.responseText);
                }
                // console.log(result);
                // countries = JSON.parse(result);
                console.log(countries);
        this.el = document.getElementById("countries");
        var table_body = '<table border="1" id="example"><thead><tr><th>firstname</th><th>lastname</th><th>title</th><th>organization</th><th>email</th><th>dob</th><th>phone</th><th>fax</th><th>address1</th><th>address2</th><th>city</th><th>state</th><th>zipcode</th><th>showmycontact</th><th>daysattending</th><th>activityattending</th><th>meals</th><th>requirements</th><th>lastconfattend</th><th>id</th></tr></thead><tbody>';
        for (var i in countries) {
            table_body += '<tr>';
            table_body += '<td>';
            table_body += countries[i].firstname;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].lastname;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].title;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].organization;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].email;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].dob;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].phone;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].fax;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].address1;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].address2;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].city;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].state;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].zipcode;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].showmycontact;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].daysattending;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].activityattending;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].meals;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].requirements;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].lastconfattend;
            table_body += '</td>';
            table_body += '<td>';
            table_body += countries[i].id;
            table_body += '</td>';
            // table_body += '<td><button onclick="app.editCountry(' + countries[i].countryid + ')">Edit</button></td>';
            // table_body += '<td><button onclick="app.deleteCountry(' + countries[i].countryid + ')">Delete</button></td>';
            table_body += '</tr>';
        }
        this.el.innerHTML = table_body;
            }
        }
        xhr.open('GET', '/country', true);
        xhr.send(null);
        

        
    };
    // this.editCountry = function (countryid) {
    //     //console.log("editCountry " + countryid);
    //     mode = "edit";
    //     document.getElementById('btn').innerHTML = "Update";
    //     for (let index = 0; index < countries.length; index++) {
    //         // const element = array[index];
    //         //console.log(countries[index].countryid);
    //         if (countries[index].id == id) {
    //             //console.log(countries[index].countryid);
    //             updateidx = index;
                // document.getElementById("id").value = countries[index].id;
                // document.getElementById("firstname").value = countries[index].firstname;
                // document.getElementById("lastname").value = countries[index].lastname;
                // document.getElementById("title").value = countries[index].title;
                // document.getElementById("email").value = countries[index].email;
                // document.getElementById("organization").value = countries[index].organization;
                // document.getElementById("dob").value = countries[index].dob;
                // document.getElementById("phone").value = countries[index].phone;
                // document.getElementById("fax").value = countries[index].fax;
                // document.getElementById("address1").value = countries[index].address1;
                // document.getElementById("address2").value = countries[index].address2;
                // document.getElementById("city").value = countries[index].city;
                // document.getElementById("state").value = countries[index].state;
                // document.getElementById("zipcode").value = countries[index].zipcode;
                // document.getElementById("showmycontact").value = countries[index].showmycontact;
                // document.getElementById("activityattending").value = countries[index].activityattending;
                // document.getElementById("meals").value = countries[index].meals;
                // document.getElementById("requirements").value = countries[index].requirements;
                // document.getElementById("lastconfattend").value = countries[index].lastconfattend;
    //             document.getElementById('id').readOnly = true;

    //         }

    //     }
    // };

    // this.deleteCountry = function (countryid) {
    //     console.log("Delete Data");
    // data = { "countryid": countryid };
    // var json = JSON.stringify(data);
    // console.log(json);
    // var request = new XMLHttpRequest();
    // request.open("DELETE", "/country", true);
    // request.setRequestHeader("Content-type", "application/json"); 
    // request.send(json);
    //     this.getAllCountries();
           // };

//     this.insert = function (countryid) {

//         var id = document.getElementById("id").value;
//         var firstname = document.getElementById("firstname").value;
//         var lastname = document.getElementById("lastname").value;
//         var title = document.getElementById("title").value;
//         var organization = document.getElementById("organization").value;
//         var email = document.getElementById("email").value;
//         var dob = document.getElementById("dob").value;
//         var phone = document.getElementById("phone").value;
//         var fax = document.getElementById("fax").value;
//         var address1 = document.getElementById("address1").value;
//         var address2 = document.getElementById("address2").value;
//         var city = document.getElementById("city").value;
//         var state = document.getElementById("state").value;
//         var zipcode = document.getElementById("zipcode").value;
//         var showmycontact = document.getElementById("showmycontact").value;
//         if (mode == "") {
//             console.log("Post Data");
//             data = { "countryid": countryid, "countryname": countryname,"currency": currency };
//             var json = JSON.stringify(data);
//             console.log(json);
//             alert("The currency of...=" +countryname+ "....is...="+currency);
//             var request = new XMLHttpRequest();
//             request.open("POST", "/country", true);
//             request.setRequestHeader("Content-type", "application/json"); 
//             request.send(json);
//         }
//         else {
//             console.log("Update Data");
//             data = { "countryid": countryid, "countryname": countryname,"currency": currency };
//             var json = JSON.stringify(data);
//             var request = new XMLHttpRequest();
//             request.open("PUT", "/country", true);
//             request.setRequestHeader("Content-type", "application/json"); 
//             request.send(json);

//             // countries.splice(updateidx, 1, updatecountry);
//             document.getElementById('btn').innerHTML = "Add";
//         }
//         document.getElementById("countryid").value = "";
//         document.getElementById("countryname").value = "";
//       document.getElementById("currency").value;
//         this.getAllCountries();
//     };
// }
}