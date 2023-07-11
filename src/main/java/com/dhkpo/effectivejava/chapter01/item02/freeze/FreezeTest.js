'use strict';

const hyeonkeun = {
    'name': 'Hyeonkeun',
    'age': 32
}

Object.freeze(hyeonkeun);

hyeonkeun.wife = '보경';
hyeonkeun.dog = '감자';

console.info(hyeonkeun.wife);
console.info(hyeonkeun.dog);
