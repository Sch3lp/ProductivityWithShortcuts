# Chapter 6 - IntelliJ's Suggestions
[_Back to outline_](outline.md)

We are but human. That means we tend to mess up from time to time.
Knowing how to quickly fix mistakes you make is a tremendous boon to your programming productivity.
Luckily, our IDE can help us fixing some of the smaller mistakes we often make.

## IntelliJ's Auto-correct ![Windows](icons/glyph-windows-32.png)`ctrl+shift+enter`

Let’s open Chapter6.java (<kbd>ctrl</kbd> + <kbd>n</kbd>), a class with many mistakes (and (a hell of (a lot of)) brackets).

Now, let’s see what IntelliJ can do for us to fix the mistakes by pressing <kbd>F2</kbd> to navigate quickly to the first
error, and press <kbd>ctrl</kbd> + <kbd>shift</kbd> + <kbd>enter</kbd>.

Press <kbd>F2</kbd> again and let's see if IntelliJ can auto-fill the missing semicolon.

Press <kbd>F2</kbd> again and see if it can auto-correct an incomplete method.

Undo (<kbd>ctrl</kbd> + <kbd>z</kbd>) your last auto-correct and type out public void poo( above the comment line.

It's basically the same thing we tried to auto-correct just a few seconds ago. The only difference is that there are now two "incomplete" error
statements.

Try pressing <kbd>ctrl</kbd> + <kbd>shift</kbd> + <kbd>enter</kbd> anyways and see what happens.

## Autocomplete ![Windows](icons/glyph-windows-32.png)`ctrl+space` vs. ![Windows](icons/glyph-windows-32.png)`ctrl+shift+space`

### Autocomplete basics
Open `Transformers.java`, a class with a lot of action in it. To quickly navigate to the missing constructor argument, use <kbd>F2</kbd>.

To have IntelliJ suggest an autocomplete option, press <kbd>Control</kbd> + <kbd>Space</kbd>. Note that even though the constructor expects an
AutobotEnum, IntelliJ may suggest other options like new, null, equals(), etc.

To have IntelliJ provide more helpful context-specific code completion actions, try using the alternative hotkey combination <kbd>
Control</kbd> + <kbd>Shift</kbd> + <kbd>Space</kbd>.

Before selecting one of the AutobotEnum suggestions, try pressing <kbd>Control</kbd> + <kbd>Shift</kbd> + <kbd>Space</kbd> again. This hotkey will
show you that there is a static method `Autobot.optimusEnum()` that also returns an `AutobotEnum`. IntelliJ knows about this method as well.

Try it out again to construct Optimus' nemesis, Megatron.

### Autocomplete selection confirmation
After using <kbd>Ctrl</kbd> + <kbd>Shift</kbd> + <kbd>Space</kbd> or <kbd>Ctrl</kbd> + <kbd>Space</kbd> to bring up suggestions, there are multiple
ways to confirm your selection:

* Pressing <kbd>Enter</kbd> completes the code.
* Pressing <kbd>Tab</kbd> replaces code that was there before.
* Pressing <kbd>.</kbd> completes the code and adds a . so you can continue typing.
* Pressing <kbd>Space</kbd> does the same but adds a space instead of a . (this is different from regular suggestions after typing a .!)

As it stands, Optimus has a method called .catchphrase that takes a prefix and returns \<prefix\> Rollout!. We can rename that method to rollout.

To navigate to the .catchphrase method, use <kbd>Ctrl</kbd> + <kbd>Alt</kbd> + <kbd>B</kbd>. Then delete catchphrase and replace it with rollout (
don't use <kbd>Shift</kbd> + <kbd>F6</kbd>).

Next, go back to the Transformers class with <kbd>Ctrl</kbd> + <kbd>Alt</kbd> + <kbd>Left</kbd> and use autocomplete to replace the previous
non-compiling catchPhrase method with the new rollout method. Try using <kbd>Enter</kbd> as your confirmation selection first, and then undo
with <kbd>Ctrl</kbd> + <kbd>Z</kbd> and retry the autocompletion using <kbd>Tab</kbd> as your selection confirmation.

Repeat the process with the other confirmation methods listed above.

## _QuickFix_ (:bulb:) ![Windows](icons/glyph-windows-32.png)`alt+enter`

IntelliJ's QuickFix is a powerful tool that can save you a lot of time and effort.
In fact, it is so powerful that it might as well be magic.
Whether you're creating a new constructor, generating getters and setters for newly created fields, or extracting a method or variable, QuickFix has
got you covered. And if your code isn't compiling, QuickFix can help you fix the problem in no time.

To use QuickFix, simply press <kbd>Alt</kbd> + <kbd>Enter</kbd>. This shortcut will bring up a menu of possible actions you can take to fix the
issue at hand. Use cases include, but are not limited to:

* Creating a new constructor? Use <kbd>Alt</kbd> + <kbd>Enter</kbd>.
* Generating getters and setters for newly created fields? Why not try <kbd>Alt</kbd> + <kbd>Enter</kbd>?
* Extracting a method out of selected code? Make a selection, and press <kbd>Alt</kbd> + <kbd>Enter</kbd>.
* Extracting a variable? Press <kbd>Alt</kbd> + <kbd>Enter</kbd>.
* Code not compiling? Press <kbd>Alt</kbd> + <kbd>Enter</kbd>.
* Need to defeat agent Smith and save the matrix? Press <kbd>Alt</kbd> + <kbd>Enter</kbd>.

QuickFix is so useful that it's probably the only IntelliJ shortcut you really need to remember, if you want to be lazy about it.

## Creating _stuff_ ![Windows](icons/glyph-windows-32.png)`alt+insert`
The "Generate" action in IntelliJ is a powerful feature that allows you to quickly create code constructs such as constructors, methods, and
getters/setters. It saves you a lot of time and effort by automatically generating boilerplate code for you, based on the parameters you provide.
You can access the Generate action by pressing <kbd>Alt</kbd> + <kbd>Insert</kbd> in the editor window. This action is particularly useful when you
need to create a large amount of repetitive code, or when you need to add functionality to your code quickly.

Try out these actions using the <kbd>alt</kbd> + <kbd>insert</kbd> shortcut:

* Create a new package from the `1: Project` _Tool Window_ to create a new class in the next step.
* Create a new class from the `1: Project` _Tool Window_.
* Create a new constructor in that class from the editor.

## Deleting _stuff_ ![Windows](icons/glyph-windows-32.png)`alt+delete`
Programming is not only about creating new concepts and abstractions but also about cleaning up and getting rid of old or unnecessary code.
Fortunately, IntelliJ makes deleting code just as easy as creating it.

To delete code, you can simply select the lines you want to remove and press <kbd>Shift</kbd> + <kbd>Delete</kbd>. You can use it to delete any
code fragment in your project.

Your turn! Use this shortcut to:

* Delete the constructor you just created
* Delete the class you just created (the package will probably be deleted automatically because it was the only class in there)

> **TIP:**  
> For more advanced scenarios, IntelliJ provides refactoring actions to help you delete code more safely and efficiently. For example, you can use
> the "inline and remove" refactoring action (<kbd>Ctrl</kbd> + <kbd>Alt</kbd> + <kbd>N</kbd>) to remove a method and all its invocations at
> once without breaking your syntactical correctness.
>
> First you empty the body of the method, next you inline it (<kbd>ctrl</kbd> + <kbd>alt</kbd> + <kbd>n</kbd>).
>
> This is sometimes called the "nuke it" option, and it can be very handy when you want to get rid of a method that is used in multiple places.
> However, be sure to use this option with caution, as it can have unintended consequences if you're not careful.

## View JavaDoc ![Windows](icons/glyph-windows-32.png)`ctrl+q`
Open `Transformers.java`, and move your cursor to `Autobot`.

Press <kbd>Ctrl</kbd> + <kbd>Q</kbd> to view the JavaDoc for the Autobot class. Press <kbd>Esc</kbd> to exit the window.

Press <kbd>Ctrl</kbd> + <kbd>Q</kbd> twice to open a larger and separate window. Note that you cannot exit this window by pressing <kbd>Esc</kbd>,
but you can close it by pressing <kbd>Ctrl</kbd> + <kbd>Q</kbd> again and then pressing <kbd>Esc</kbd>.

You can also use <kbd>Ctrl</kbd> + <kbd>Q</kbd> from inside the autocompletion suggestion box. Try calling `.toString()` after your `new Autobot()`
statement using autocompletion (either by typing <kbd>.</kbd> or by pressing <kbd>Ctrl</kbd> + <kbd>Space</kbd>).

While still in the autocompletion suggestion box, navigate to the `.toString()` option and press <kbd>Ctrl</kbd> + <kbd>Q</kbd> to read the associated JavaDoc.

## View parameters ![Windows](icons/glyph-windows-32.png)`ctrl+p`
If you are ever in doubt on which parameters to provide to a method, press <kbd>ctrl</kbd> + <kbd>P</kbd>
while your cursor is inside the brackets of a method invocation statement. IntelliJ will tell you what parameterization is needed, and even
offer a list of alternative invocation options.

In the `Transformers.java` class, let's try to create the `Decepticon`, known as __"StarScream"__.

First uncomment the `// Decepticon.StarScream()` line.

Then put your cursor in between the brackets and type <kbd>ctrl</kbd> + <kbd>P</kbd>.

Notice how IntelliJ signals which parameter you are required to fill in by **emboldening** the parameter name.

---

[_Next Chapter_](chapter7.md)
[_Back to outline_](outline.md)