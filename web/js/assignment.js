var images = document.getElementsByClassName("slider")[0].getElementsByTagName("img");
var title = document.getElementById("titleSlider");
var lstBtn = document.getElementsByClassName("slider")[0].getElementsByTagName("button");
var call = true;
function initSlider() {
    images[indexCurrent].style.opacity = 1;
    // title.innerText = images[indexCurrent].getAttribute("title");
    if (showbutton == false) {
        var lengthButton = lstBtn.length;
        for (i = 0; i < lengthButton; i++) {
            lstBtn.item(0).remove();
        }
    }
    if (loop) {
        setInterval(getNextImage, duration);
    }
}

function setImage(indexOld) {

    for (i = 0; i < images.length; i++) {
        if (i != indexOld)
            images[i].style.opacity = 0;
    }
    var opacity = 0;
    var opacityImageOld = 1;
    var setOpacity = setInterval(function () {
        images[indexCurrent].style.opacity = opacity;
        images[indexOld].style.opacity = opacityImageOld;
        // title.innerText = images[indexCurrent].getAttribute("title");
        if (opacity >= 1 && opacityImageOld <= 0) {
            call = true;
            clearInterval(setOpacity);
            return;
        }
        opacity += 0.02;
        opacityImageOld -= 0.02;
    }, duration / 100);

}

function getNextImage() {

    if (call == false) {
        return;
    }
    if (indexCurrent == images.length - 1) {
        indexCurrent = 0;
        setImage(images.length - 1);
    }
    else {

        indexCurrent++;
        setImage(indexCurrent - 1);
    }
    call = false;
}

function getPrevImage() {

    if (call == false) {
        return;
    }
    if (indexCurrent == 0) {
        indexCurrent = images.length - 1;
        setImage(0);
    }
    else {

        indexCurrent--;
        setImage(indexCurrent + 1);
    }
    call = false;
}




/***************************************************************************************
* Run when page load
***************************************************************************************/
$(document).ready(function () {
    initSlideShow();

});
/***************************************************************************************
****************************************************************************************/
function initSlideShow() {
    if ($(".slideshow div").length > 1) //Only run slideshow if have the slideshow element and have more than one image.
    {
        var transationTime = 5000;//5000 mili seconds i.e 5 second
        $(".slideshow div:first").addClass('active'); //Make the first image become active i.e on the top of other images
        setInterval(slideChangeImage, transationTime); //set timer to run the slide show.
    }
}
/***************************************************************************************
****************************************************************************************/

function slideChangeImage() {
    var active = $(".slideshow div.active"); //Get the current active element.
    if (active.length == 0) {
        active = $(".slideshow div:last"); //If do not see the active element is the last image.
    }

    var next = active.next().length ? active.next() : $(".slideshow div:first"); //get the next element to do the transition
    active.addClass('lastactive');
    next.css({ opacity: 0.0 }) //do the fade in fade out transition
        .addClass('active')
        .animate({ opacity: 1.0 }, 1500, function () {
            active.removeClass("active lastactive");
        });

}


function Xoa() {
    document.getElementById("myForm").reset();
};
//form
function check() {
    var name = document.getElementById("name").value;
    if (name.length === 0) {
        document.getElementById("name").focus();
        document.getElementById("label_name").value = "* Không để trống họ tên.";
        return false;
    } else {
        document.getElementById("label_name").value = "";
    }

    var date = document.getElementById("ngay_sinh").value;
    if (date == "") {
        document.getElementById("ngay_sinh").focus();
        document.getElementById("label_date").value = "* Không được để trống ngày sinh.";
        return false;
    } else {
        document.getElementById("label_date").value = "";
    }

    var email = document.getElementById("email").value;
    if (email.length === 0) {
        document.getElementById("email").focus();
        document.getElementById("label_email").value = "* Không được để trống email.";
        return false;
    } else {
        document.getElementById("label_email").value = "";
    }
    var email = document.getElementById('email');
    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (!filter.test(email.value)) {
        document.getElementById("label_email").value = "Hay nhap dia chi email hop le.\nExample@gmail.com";
        email.focus;
        return false;
    }
    var tour = document.getElementById("tour");
    var sport = document.getElementById("sport");
    var scientist = document.getElementById("scientist");
    var culture = document.getElementById("culture");
    if (tour.checked == false && sport.checked == false && scientist.checked == false && culture.checked == false) {
        document.getElementById("label_favorite").value = "Bạn phải chọn 1 sở thích";
        return false;
    }
    document.getElementById("label_favorite").value = '';
    var sdt = document.getElementById("sdt");
    if (isNaN(sdt.value)) {
        document.getElementById("phone").value = " Vui lòng nhập số!";
        document.getElementById("sdt").focus();
        return false;
    } else if (parseFloat(sdt.value) <= 0) {
        document.getElementById("phone").value = " Vui lòng kiểm tra lại số phone!";
        document.getElementById("sdt").focus();
        return false;
    } else if (sdt.value === "" || sdt.value.length > 11 || sdt.value.length < 10) {
        document.getElementById("phone").value = " Vui lòng kiểm tra lại số phone!";
        document.getElementById("sdt").focus();
        return false;
    }
    document.getElementById("phone").value = "";
    return true;
};

function UpperCaseFirstChar(str) {
    return (str + '').replace(/^([a-z])|\s+([a-z])/g, function ($1) {
        return $1.toUpperCase();
    });
}
var params = {

    save: function () {
        if (check() == true) {
            var params = new Object();
            params.name = document.getElementById("name").value;

            params.date = document.getElementById("ngay_sinh").value;

            var nam = document.getElementById("nam");
            if (nam.checked) {
                params.sex = "Male";
            } else {
                params.sex = "Female";
            }
            params.country = document.getElementById("country").value;
            params.email = document.getElementById("email").value;
            params.job = document.getElementById("list_job").value;
            params.address = document.getElementById("address").value;
            params.country = document.getElementById("country").value
            var sport = document.getElementById("sport");
            if (sport.checked) {
                params.sport = "1";
            } else {
                params.sport = "0";
            }
            var tour = document.getElementById("tour");
            if (tour.checked) {
                params.tour = "1";
            } else {
                params.tour = "0";
            }
            var culture = document.getElementById("culture");
            if (culture.checked) {
                params.culture = "1";
            } else {
                params.culture = "0";
            }
            var scientist = document.getElementById("scientist");
            if (scientist.checked) {
                params.scientist = "1";
            } else {
                params.scientist = "0";
            }

            window.location = ("F:/Javascript/Vulaph06891/detail.html?name=" + params.name + "&date=" + params.date + "&sex=" + params.sex + "&country=" + params.country + "&email=" + params.email + "&job=" + params.job + "&address=" + params.address + "&sport=" + params.sport + "&tour=" + params.tour + "&culture=" + params.culture + "&scientist=" + params.scientist);
            // truyền param lên thanh url
        }
    },
    show: function () {
        var name = GetURLParameter('name');
        var date = GetURLParameter('date');
        var email = GetURLParameter('email');
        var job = GetURLParameter('job');
        var address = GetURLParameter('address');
        var sport = GetURLParameter('sport');
        var tour = GetURLParameter('tour');
        var culture = GetURLParameter('culture');
        var scientist = GetURLParameter('scientist');
        var sex = GetURLParameter('sex');
        var country = GetURLParameter('country');
        name = name.replace(/%20/g, ' ');
        name = name.replace(/\s+/g, ' ');
        name = UpperCaseFirstChar(name);
        address = address.replace(/%20/g, ' ');
        address = address.replace(/\s+/g, ' ');
        address = UpperCaseFirstChar(address);
        job = job.replace(/%20/g, ' ');
        document.getElementById("name_student").value = name;
        document.getElementById("date_student").value = date;
        document.getElementById("email_student").value = email;
        document.getElementById("sex").value = sex;
        document.getElementById("country").value = country;
        document.getElementById("job_student").value = job;
        document.getElementById("address_student").value = address;
        if (Number(tour) == 1) {
            document.getElementById("tour").checked = true;
        }
        if (Number(sport) == 1) {
            document.getElementById("sport").checked = true;
        }
        if (Number(culture) == 1) {
            document.getElementById("culture").checked = true;
        }
        if (Number(scientist) == 1) {
            document.getElementById("scientist").checked = true;
        }
        console.log("flkdjlsakjfdlakfasdf" + name + "     fasdfafass");
    }
};
// lấy pram từ url
function GetURLParameter(sParam) {
    var sPageURL = window.location.search.substring(1);
    var sURLVariables = sPageURL.split('&');
    for (var i = 0; i < sURLVariables.length; i++) {
        var sParameterName = sURLVariables[i].split('=');
        if (sParameterName[0] == sParam) {
            return sParameterName[1];
        }
    }
}




