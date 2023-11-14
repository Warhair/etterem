# Étterem

## Étterem program I.
Egy étterem ételt vesz. Ha megeszi az ételt, akkor elfogy az étel. Az ételt a tulajdonosuk nevével azonosítja az étterem, el is lehet vinni az ételt (név alapján) az étteremből! 


| Petrovai Asztrik Örs       |Tegzes Márton              |Dobrocsi Kornél              |
|------------------|------------------------|------------------------|
|readme         |  github repo  |   netbeans alapprogram |


## Étterem program I.
Egy étterem rendeléseket vesz be. Ha kiviszik őket, akkor a rendelés leadva lesz. A rendelést az asztal számával azonosítja az étterem, ki kell fizetni a rendelést (asztal alapján) az étteremben.

### Technikai specifikáció: 
Az Étterem tömbben tárolja a rendeléseket! Az étterem alapértelmezetten 5 rendelés befogadására alkalmas, de ettől eltérőt is megadhatunk! Nem kell optimalizálni, hogy a kiadott rendelés helyére vegyünk fel új rendelést, folyamatosan rakjuk a tömbbe a rendeléseket! A kifizetésnél is csak annyit kell megcsinálni, hogy ne legyen már az étteremben a rendelés! Jelezzük, ha megtelt az étterem, de máshogy nem kell foglalkozni ezzel az esettel!

## Étterem program II.
Az étterem fejlődött, most már makaronit is be tud venni! A makaronik van mennyisége, ami minden rendelés után csökken 3% -kal!

### Technikai specifikáció: 
A fork-olt projektben legyen toString a termék osztályokban! Javítsd a hibát is!

## Étterem program III.
Az étterem le is tud égni, ekkor minden beadott rendelés megsemmisül! Az étterem a továbbiakban nem üzemel, nem tud rendeléseket bevenni!

### Technikai specifikáció: 
A kivett rendeléseket újra be lehet kérni, és beadni egy másik, még működő étterembe!

## Étterem program IV.
Az étterem specializálódott, már nem fogad általános rendeléseket, hanem specializálódott makaronira és becsi szeletre! A becsi szeletek egyre kevesebbek lesznek, ha nem prémium rendeléssel rendelik őket! A mennyiség „egész tál”, „háromnegyed tál”, „fél tál”, „negyed tál”, és „üres”. A legkevesebb már nem csökken tovább, prémium rendelésnél tartja a mennyiséget. A makaroni prémium rendelésnél már csak 1.5% -ot veszítenek a mennyiségükből.

### Technikai specifikáció: 
A Etel legyen abstract, a makaroni és a becsi_szelet őse. Mindegyik másként reagál a rendelésre, de egyformán fogynak el.




### main
1. etterem_program

### modell
1. Etterem
2. becsi_szelet
3. etel
4. makaroni
5. pizza
