package day60_Collection;

public class classNote {
    /*
    10/03/2020
Topics: Collection

package name: day60_Collection

please go to Canvas -> java -> modules - > day60
		download Collection's presentation and Collection Hierarchy (2 files)


Data Structurs: in order to manage data effetiently, and organized manner

	1. Array (fixed)
	2. Collection (dynamic)
	3. Map (dynamic)


Array: size is fixed
	   supports both primitives & objects
	   can be multi-dimentional


Collections framework: consists of multiple interfaces, each interface is implemented by class/classes

			presented in "java.util"


Collection(I): extended by List, Set, Queue
		size is automatically adjusted

		List(I): implemented by ArrayList(C), LinkedList(C), Vector(C)==> Stack(C)

				has index number, accepts duplicates


				ArrayList(C): array based class, internally uses the array

								retrieving data is faster ( get() )

				LinkedList(C): each objects are doublly linked

						doublly linked ===>add/remove are faster


				Vector(C): is synchronized, it's thread safe in multi-thread envireonment


				Stack(C): child of Vector, it's thread safe in multi-thread envireonment

					pop(): LIFO, last in first out
							return the last object in the stack, and removes it from the stack


		Queue(I): FIFO

				accepts duplicates, does not have index number

				poll(): removes the first object that's inserted


		Set(I): implemented by HashSet, LinkedHashSet, TreeSet

				does not accepts duplicates, does not have index number


				HashSet vs LinkedHashSet:
						LinkedHashSet keeps the insertion order

				HashSet vs TreeSet:
					hashset accepts null, treeset does not accept null
					hashset is faster than treeset




synchronized: used for achieving thread safety
		advantage: thread safe

thread-safety: one thread at a time, when there are multi-thread

thread: process of the operating system scheduling the object

multi-thread: two or more thread are being executed


Canavs - >Java -> day60 -> Polymorphism short quiz


null keyword: default value of all reference type (class/interface)
			does not refer to any objects, not an instance of anything


	WebDriver driver = null;
			driver.get(URL) // nullpointerexception
	WebElement elemnt = null;


String[] arr = {"A", "A", "B", "C", "A"....}



task:
	1. write a program that can identify if two strings are build out of same characters
		ex:
			str1 = "abcabc"
			str2 = "cab"

			output:
				true

			str1 = "cabccccccaaaaaa";
			str2 = "bca";

			output:
				true


	2. write a program that can remove duplicates from an array of String.
		at the end MUSt return array


Iterable: Root interface
	classes that are implementing iterable, gains the ability to iterate the objects

	we can apply Iterator(I) to the classes that are implementing iterable

Iterator(I):
	1. it allows us to get access to the each objects in collection type

	2. it allows us to remove the objects from collection type


	iterator(): iterates any collection, then returns iterator

	hasNext(): checks if there are enough elemnts left to be iterated, returns boolean

	1, 2, 3, 4


	next(): if hasNext() is true, it access to the object, otherwise no objects can be accessed


	remove(): removes the current element of the iteration



next topic:
	Map



















     */
}
