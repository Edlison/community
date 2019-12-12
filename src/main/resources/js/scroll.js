var cards = document.getElementsByClassName("card");
var parentDiv = document.getElementById("cards-container");


let move = function (timeCount) {
    let cards = document.getElementsByClassName("card");
    for (const card of cards) {
        card.style.left = "-" + (timeCount) + "px";
    }
};

let appendNewChild = (timeCount) => {
    cards[0].remove();
    var parentDiv = document.getElementById("cards-container");
    var newChildDiv = document.createElement("div");
    newChildDiv.innerHTML = ` <a href="">
                    <img src="../images/search.png" alt="">
                    <h3>标题</h3>
                    <p>描述</p>
                </a>`;
    newChildDiv.setAttribute("class", `card`);
    parentDiv.appendChild(newChildDiv);
}

var MyScroll = (timeCount) => {
    var interval = null;
    var parentDiv = document.getElementById("cards-container");
    var leftButton = document.getElementById("leftbutton");
    var rightButton = document.getElementById("rightbutton");
    //parentDiv.addEventListener("mouseover", clearInterval(interval));
    interval = setInterval(() => {
        ScrollInterval();        
    }, 5);
    parentDiv.addEventListener("mouseover",()=>{
        clearInterval(interval);
    }    );
    parentDiv.addEventListener("mouseout",()=>{
        interval = setInterval(() => {
            ScrollInterval();          
        }, 5);
    });


    ScrollInterval=()=>{
        if (timeCount <= cards[0].offsetWidth/2) {
            move(timeCount);
            timeCount += 0.1;
        } else if (Math.abs(timeCount) >= (cards[1].offsetWidth/2)) {
            appendNewChild();
            cards[4].style.left = "-"+(timeCount)+"px";
            timeCount = 0;
        }
    }
    leftButton.addEventListener("click",()=>{

        clearInterval(interval);
        let cards = document.getElementsByClassName("card");
        timeCount = timeCount + 50;
        for (const card of cards) {
            card.style.left = "-"+(timeCount)+"px";
        }
        if (Math.abs(timeCount) >= (cards[1].offsetWidth/2)) {
            appendNewChild();
            timeCount = 0;
        }
    });
    rightButton.addEventListener("click",()=>{
        clearInterval(interval);
        let cards = document.getElementsByClassName("card");
        timeCount = timeCount - 100;
        for (const card of cards) {
            card.style.left = "-"+(timeCount)+"px";
        }
        if (Math.abs(timeCount) >= (cards[1].offsetWidth/2)) {
            appendNewChild();
            cards[4].style.left = "-"+(timeCount)+"px";
            timeCount = 0;
        }
    });
};
