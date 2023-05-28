package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Damjan", "Majmun123*", "damjan_srbinovski@live.com");
        User user2 = new User("Petar", "Petar123*", "Petar_Petkovski@live.com");
        User user3 = new User("Marko", "Marko1235*", "Marko_markovski@live.com");
        User user4 = new User("Logan", "Logan12355*", "Logan_Loganovski@live.com");
        List<User> userList = new List<User>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<User> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(User user) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends User> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends User> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public User get(int index) {
                return null;
            }

            @Override
            public User set(int index, User element) {
                return null;
            }

            @Override
            public void add(int index, User element) {

            }

            @Override
            public User remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<User> listIterator() {
                return null;
            }

            @Override
            public ListIterator<User> listIterator(int index) {
                return null;
            }

            @Override
            public List<User> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        user1.setUsername(null);
        SILab2.function(user1,userList);

    }
}
