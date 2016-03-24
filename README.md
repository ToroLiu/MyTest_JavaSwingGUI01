
## Tutorial key points

1. Generate a UI thread for JFrame, call `SwingUtiliteis.invokeLater`, and provide a `Runnable` object. Inside the `Runnable`, implement the `run()` function for Swing GUI.
2. Intellij IDEA provides `New` -> `GUI Form`. For example, for `MainForm` class, it will connect the GUI components in `MainForm.form` with the member variables defined in `MainForm.java`
   In order to use the `MainForm` class, let `MainForm` inherits the `JFrame`, and set root panel to that generated from `MainForm.form`.


```
   
    public MainForm() {
        super("Hello World");
        setContentPane(panel1);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
```

