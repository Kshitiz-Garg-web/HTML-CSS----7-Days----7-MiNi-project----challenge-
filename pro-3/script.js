const touchme = document.querySelector("body > div > div.notshow.touchme > button");
const showme = document.querySelector("body > div > div.container.notshow");
const touchmeremove = document.querySelector("body > div > div.notshow.touchme");
const allover = document.querySelector("body > div");
const cross = document.querySelector("body > div > div.container.notshow > img");
const btm = document.querySelector("body > footer");
const sub = document.querySelector("body > div > div.container > div.action > button");
const lazyon = document.querySelector("body");

touchme.addEventListener('click', (e) => {
    showme.classList.remove('notshow');
    touchmeremove.classList.remove('notshow')
    lazyon.classList.add('lazy');
})

cross.addEventListener('click', (e) => {
    allover.classList.add('whole');
    btm.classList.add('whole');
    lazyon.classList.remove('lazy');
})

sub.addEventListener('click', (e) => {
    allover.classList.add('whole');
    btm.classList.add('whole');
    lazyon.classList.remove('lazy');
})