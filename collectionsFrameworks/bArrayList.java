import java.util.*;


// ArrayList: It is a dynamic array which can grow and shrink as per the requirement
// Methods of ArrayList:
// 1. add(element): It adds the element at the end of the ArrayList
// 2. get(index): It returns the element at the specified index
// 3. size(): It returns the size of the ArrayList
// 4. remove(index): It removes the element at the specified index
// 5. set(index, element): It sets the element at the specified index
// 6. indexOf(element): It returns the index of the specified element
// 7. clear(): It removes all the elements from the ArrayList
// 8. contains(element): It returns true if the element is present in the ArrayList
// 9. containsAll(collection): It returns true if all the elements of the collection are present in the ArrayList
// 10. isEmpty(): It returns true if the ArrayList is empty


public class bArrayList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
