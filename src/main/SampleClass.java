package com.example;

public class SampleClass {

    // This method has a code smell: it is too complex
    public void complexMethod() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;
        int h = 8;
        int i = 9;
        int j = 10;

        if (a > b) {
            if (c > d) {
                if (e > f) {
                    if (g > h) {
                        if (i > j) {
                            System.out.println("Complex method");
                        }
                    }
                }
            }
        }
    }

    // This method has a bug: potential null pointer dereference
    public void nullPointerMethod(String input) {
        if (input.equals("test")) {
            System.out.println("Input is test");
        }
    }

    // This method has a security vulnerability: hardcoded password
    public void hardcodedPassword() {
        String password = "12345";
        System.out.println("Password: " + password);
    }

    // This method has a code smell: unused variable
    public void unusedVariable() {
        int unused = 0;
        System.out.println("This method has an unused variable");
    }
}