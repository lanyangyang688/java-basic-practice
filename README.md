# java
Lan Yangyang's Java Learning Journey

##   java-stage-one
Java beginner practice reference: Han Shunping and kuangshen's Java exercise problems

### 📚 Covered Topics  
#### 1. Han Shunping (HSP) Java  
- Variables, operators, conditional statements (if/switch), loops (for/while)  
- One-dimensional and two-dimensional arrays, array traversal, finding maximum and minimum values  
- Basic sorting algorithms: bubble sort  
- Classic examples: printing Pascal's triangle, array operation exercises 
#### 2. Crazy God Talks Java(Kuangshen)  
- Reinforce Java basics and syntax  
- Fundamental logic and introductory object-oriented practice 
#### 3. Exam paper  
- In-class synchronized basic coding exercises  
- Complete implementation of the final comprehensive project, including integrated logic, multi-class collaboration, and advanced array applications

##   java-stage-two
Java Advanced Object-Oriented & Core Fundamental Practice, covering advanced OOP features, enumerations, annotations, exceptions, wrapper classes and collection framework.

### 📚 Covered Topics
### Chapter1 Advanced Object-Oriented Programming
#### 1.Abstract Class
- Definition and usage rules of abstract classes and abstract methods
- Characteristics: cannot be instantiated, subclasses must implement abstract methods
- Template-oriented object-oriented design practice
#### 2.Interface
- Interface definition and implementation rules
- Interface constants, abstract methods, Java8 default/static methods
- Multi-implementation and multi-interface inheritance
- Comparison and scene selection of abstract class & interface
#### 3.Code Block
- Classification of code blocks: local code block, instance code block, static code block, synchronized code block
- Syntax writing & execution timing of each type of code block
- Execution order rule: static code block → instance code block → constructor → local code block
- Core functions & application scenarios of each code block
- Interview focus: static code block loading order under parent-child inheritance
#### 4.Inner Class
- Classification of inner classes: member inner class, static inner class, local inner class, anonymous inner class
- Access rules between outer class and inner class (mutual access of private members)
- Instantiation syntax of different inner classes
- Anonymous inner class: common usage with interfaces/abstract classes
- Application scenarios & memory structure features of inner classes
#### 5.Exercise

### Chapter2 Exception,Enum And Annotations
#### 1.Exception
- Classification & system hierarchy: Throwable root, split into Error, Checked Exception, Unchecked(Runtime) Exception
- Core syntax & keywords: try-catch-finally, throws, throw, try-with-resources
- Common methods of Throwable: getMessage(), printStackTrace(), getCause(), fillInStackTrace()
- Differences between checked & unchecked exceptions, typical common exception cases (NullPointerException, IndexOutOfBoundsException, IOException etc.)
- Custom exception definition & usage rules
- Application scenarios: business error signaling, fault isolation, log & alert reporting, parameter validation
- Interview focus: finally execution order & return trap, exception chaining, catch broad exception anti-pattern, exception performance overhead
#### 2.Enum
- Definition characteristics & basic syntax of enumeration class
- Common methods of Enum: values(), valueOf(), ordinal()
- Differences between enum and ordinary constant class
- Application scenarios: state management, type limitation, parameter constraint
- Interview focus: enum singleton implementation principle
#### 3.Annotation
- Classification of annotations: marker annotation, single-value annotation, full annotation
- Four meta-annotations: @Target, @Retention, @Documented, @Inherited
- Custom annotation writing & parsing logic
- Built-in core annotations: @Override, @Deprecated, @SuppressWarnings
- Application scenarios: framework markup, parameter verification, code generation
#### 4.Exercise

### Chapter3 Common Class
#### 1.Wrapper
- Wrap 8 primitive types into reference types, support autoboxing & unboxing
- Enable collection storage, provide type conversion/parsing methods; Integer cache range -128~127
#### 2. String / StringBuffer / StringBuilder
- String: Immutable, constant pool stored, modify creates new object
- StringBuffer: Mutable, synchronized/thread-safe, low performance (multi-thread)
- StringBuilder: Mutable, non-thread-safe, high efficiency (single-thread, preferred)
#### 3. Math
- Static math utility class (cannot instantiate)
- Core: abs, max/min, random, round, pow; constants PI, E
#### 4. Date & Time
- Date: Timestamp record, awkward API, unsafe
- Calendar: Manual date field adjustment, complex
- JDK8 LocalDate/LocalDateTime: Immutable, thread-safe, clean API, recommended
#### 5. System
- System static utility class
- Common: currentTimeMillis, arraycopy, exit, getProperty
#### 6. Arrays
- Array operation tool class
- Core: sort, binarySearch, copyOf, toString, equals
#### 7. BigInteger & BigDecimal
- BigInteger: Arbitrary-precision integer, avoid long overflow
- BigDecimal: Precise decimal calculation, fix float/double precision loss, for finance
#### 8.Exercise

### Chapter4 Collection
#### 1.Collection
- Java container for storing multiple objects, different from array
- Array: fixed length, supports primitive & reference types
- Collection: variable length, only stores reference types
- Root interface of single-column collections, defines universal CRUD methods
- Two traversal ways: Iterator, enhanced for-loop
- Two main sub-interfaces: List, Set
#### 2.Collections
- Static tool class for all Collection subclasses
- Core methods: sort(), binarySearch(), reverse(), shuffle(), synchronizedList() etc.
- Provides thread-safe conversion methods for unsynchronized collections
#### 3.List
- Features: ordered storage, duplicate elements allowed, supports index access
- ArrayList: underlying dynamic array, fast query, slow middle add/remove, non-thread-safe, most commonly used
- Vector: array-based, synchronized methods(thread-safe), low performance, outdated
- LinkedList: underlying double linked list, slow random query, fast head/tail add & delete
#### 4.Set
- Features: unordered storage, duplicate elements forbidden, no index
- HashSet: based on HashMap hash table, deduplicate via hashCode() + equals(), non-thread-safe
#### 5.Map
- Double-column collection, stores key-value pairs
- Keys are unique, values allow duplication
- Separated branch from Collection interface, unrelated to single-column collection system

##   java-stage-three
#### 1.Reflection
- Core reflection entry class: Class, three ways to get Class object
- Reflection operation: constructors, member variables, member methods
- Access private members by reflection, turn off access check
- Advantages & disadvantages of reflection
- Application scenarios: Spring IoC, ORM mapping, framework bottom layer

### 🛠 Runtime Environment  
- JDK: JDK 8 / JDK 17  
- Development Tool: IntelliJ IDEA  
- No third-party frameworks, pure native Java code, ready to run out of the box 
### ▶ Code Execution Methods  
#### Method 1: IDEA (Recommended)  
1. Clone this repository to your local machine  
2. Open the project root directory in IDEA  
3. Right-click the target `.java` file → `Run 'Main'` 
#### Method 2: Compile and Run via Command Line
Compile all code and output to the bin folder javac -d bin src/**/*.java
## Execute a specified class (example) java -cp bin hsp-hanshunping.array-practice.BubbleSort
