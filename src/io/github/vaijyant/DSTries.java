package io.github.vaijyant;

import java.util.Scanner;

public class DSTries {
    DSTries() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node root = new Node();
        for (int a0 = 0; a0 < n; a0++) {
            String op = in.next();
            String contact = in.next();

            if (op.equals("add")) {
                add(root, contact);
            } else if (op.equals("find")) {
                find(root, contact);
            }
        }
    }

    public static void add(Node root, String contact) {
        for (int i = 0; i < contact.length(); i++) {
            char ch = contact.charAt(i);
            if (root.map[ch - 'a'] == null) {
                root.map[ch - 'a'] = new Node();
                root = root.map[ch - 'a'];
                root.numb = 1;
            } else {
                root = root.map[ch - 'a'];
                root.numb++;
            }
        }
    }

    public static void find(Node root, String contact) {
        for (int i = 0; i < contact.length(); i++) {
            char ch = contact.charAt(i);
            if (root.map[ch - 'a'] != null) {
                root = root.map[ch - 'a'];
            } else {
                System.out.println(0);
                return;
            }
        }
        System.out.println(root.numb);
    }

    public static class Node {
        Node[] map = new Node[26];
        boolean isWord;
        int numb;
    }
}
