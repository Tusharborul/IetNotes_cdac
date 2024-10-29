/* $('input').keypress(function (event) {
    console.log(event)
})

$('input').keypress(function (event) {
    if (event.which == 88 || event.which == 120) {
        alert('Hello you are pressing x or X, You are under monitoring!!!')
    }
}) 

$('button').click(function () {
    alert('Hello dont sleep');
    $(this).css('background', 'red');
})
    */

$(document)


    .keypress(function (event) {


        var keyCode = event.which;


        if (keyCode == 13) {
            alert('Hello attention, You are under monitoring!!!')
        }


        var targetElement = event.target;


        console.log("You pressed a key on the " + targetElement.nodeName + " element");

    });