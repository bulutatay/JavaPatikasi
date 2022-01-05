package KosulIfadeleri;
import java.util.Scanner;

public class Burclar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mont, day;
        String burc = "";
        boolean isError = false;

        System.out.print("Doğdunuz ay: ");
        mont = input.nextInt();

        if (mont >= 1 && mont <= 12) {
            System.out.print("Doğduğunuz gün: ");
            day = input.nextInt();

            if (mont == 1) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }
            }

            if (mont == 2) {
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                } else {
                    isError = true;
                }
            }

            if (mont == 3) {
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                } else {
                    isError = true;
                }
            }

            if (mont == 4) {
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                } else {
                    isError = true;
                }
            }

            if (mont == 5) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                } else {
                    isError = true;
                }
            }

            if (mont == 6) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                } else {
                    isError = true;
                }
            }

            if (mont == 7) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
            }

            if (mont == 8) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                } else {
                    isError = true;
                }
            }

            if (mont == 9) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
            }

            if (mont == 10) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
            }

            if (mont == 11) {
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
            }

            if (mont == 12) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                } else {
                    isError = true;
                }
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.print("Hatalı bir giriş yaptınız. Lütfen tekrar deneyiniz.");
        } else {
            System.out.print("Burcunuz: " + burc);
        }
    }
}