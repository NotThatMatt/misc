        int a = 10;
        int n = 0;

        if (a % 5 == 0) {
            n = 5;
        }
        if (a % 3 == 0) {
            n = 3;
        }
        if (a % 2 == 0) {
            n = 2;
        }


        System.out.println(n);

        switch (n) {
            case 2:
                System.out.println("This number is divisible by 2");
                break;

            case 3:
                System.out.println("This number is divisible by 3");
                break;

            case 5:
                System.out.println("This number is divisible by 5");
                break;

            default:
                System.out.println("This number is undetermined");

        }


        }
        }