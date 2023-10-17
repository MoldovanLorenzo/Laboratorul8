## Explicația Clasei Operatii

### `double add(double n1, double n2) throws Exception`

Această metodă primește două valori de tip dublu, `n1` și `n2`, ca parametri și calculează suma lor. De asemenea, verifică anumite condiții:

- Dacă atât `n1` cât și `n2` sunt egale cu 0, aruncă o excepție cu mesajul "Numerele sunt nule."
- Dacă suma dintre `n1` și `n2` este egală cu infinit pozitiv, aruncă o excepție cu mesajul "suma celor 2 numere este egală cu +infinit."
- Dacă suma dintre `n1` și `n2` este egală cu infinit negativ, aruncă o excepție cu mesajul "suma celor 2 numere este egală cu -infinit."

### `double divide(double n1, double n2) throws Exception`

Această metodă primește două valori de tip dublu, `n1` și `n2`, ca parametri și calculează rezultatul împărțirii lor. De asemenea, verifică anumite condiții:

- Dacă atât `n1` cât și `n2` sunt egale cu 0, aruncă o excepție cu mesajul "Numerele sunt nule."
- Dacă suma dintre `n1` și `n2` este egală cu infinit pozitiv, aruncă o excepție cu mesajul "suma celor 2 numere este egală cu +infinit."
- Dacă suma dintre `n1` și `n2` este egală cu infinit negativ, aruncă o excepție cu mesajul "suma celor 2 numere este egală cu -infinit."

### `double average(List<Double> valori) throws Exception`

Această metodă calculează media unei liste de valori de tip dublu. Ea primește ca parametru o listă de valori de tip dublu, `valori`. Metoda iterează prin lista, adunând toate valorile și apoi le împarte la numărul de elemente din listă pentru a calcula media.

- Dacă lista este goală, adică nu conține niciun element, metoda va arunca o excepție cu mesajul "Eroare la calculul mediei: lista este goală."
