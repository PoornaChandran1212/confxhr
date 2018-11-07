var app = new function () {
    this.FetchAll = function () {
        var xhr = new XMLHttpRequest();
        xhr.onreadystatechange = function () {
            if (xhr.readyState == XMLHttpRequest.DONE) {
                result = xhr.responseText;
                // console.log(result);
                a = JSON.parse(result);
            }
        }
        xhr.open('GET', '/country', true);
        xhr.send(null);
    }
 
    this.insert = function () {
        var formData = new FormData(index);
 
        result = {};
 
        for (var pair of formData.entries()) {
            // console.log(JSON.stringify(pair))
 
            result[pair[0]] = pair[1];
 
 
        }
        // console.log(result);
 
    }
 
 
 }