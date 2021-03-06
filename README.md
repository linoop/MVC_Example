# MVC_Example
MVC (Model View Controller) Architecture Pattern in Android
Developing an android application by applying a software architecture pattern is always preferred by the developers. An architecture pattern gives modularity to the project files and assures that all the codes get covered in Unit testing. It makes the task easy for developers to maintain the software and to expand the features of the application in the future. There are some architectures that are very popular among developers and one of them is the Model—View—Controller(MVC) Pattern. The MVC pattern suggests splitting the code into 3 components. While creating the class/file of the application, the developer must categorize it into one of the following three layers:

Model: This component stores the application data. It has no knowledge about the interface. The model is responsible for handling the domain logic(real-world business rules) and communication with the database and network layers.
View: It is the UI(User Interface) layer that holds components that are visible on the screen. Moreover, it provides the visualization of the data stored in the Model and offers interaction to the user.
Controller: This component establishes the relationship between the View and the Model. It contains the core application logic and gets informed of the user’s behavior and updates the Model as per the need.
