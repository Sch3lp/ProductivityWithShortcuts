# Chapter 2 - Navigation
[_Back to outline_](outline.md)

## Word-skipping ![Windows](icons/glyph-windows-32.png)<kbd>ctrl</kbd>+<kbd>arrows</kbd>

Open `Chapter2.java`, and place your cursor in front of the word _"The"_ of the popular phrase, and tap ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>&#8594</kbd> 8 times.
You should now have your cursor at the beginning of the word _"camel"_.

## Begin/End of Line ![Windows](icons/glyph-windows-32.png)<kbd>home</kbd>, <kbd>end</kbd>
Still in `Chapter2.java`, place your cursor at the start of the popular phrase, and press <kbd>end</kbd>.
Press <kbd>home</kbd> once, look at your cursors position, then press <kbd>home</kbd> again and see what happens. Press <kbd>home</kbd> one more
time.

If you would like to see a stroboscopic effect, put your cursor at the beginning of the word _"return"_, and hold down ![Windows](icons/glyph-windows-20.png)<kbd>shift</kbd> + <kbd>
home</kbd>.

Enjoy annoying anyone that might be watching over your shoulder.

## Begin/End of File ![Windows](icons/glyph-windows-32.png)<kbd>ctrl</kbd>+<kbd>home</kbd>, <kbd>ctrl</kbd>+<kbd>end</kbd>
Try out ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>home</kbd> and ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>end</kbd> in `Chapter2.java`.  
Alternatively, you can accomplish the same using ![Windows](icons/glyph-windows-20.png)<kbd>PgUp</kbd> and <kbd>PgDn</kbd>.

## CamelHumps (+ how to toggle)
In `Chapter2.java`, put your cursor at the beginning of the method `theQuickBrownFoxJumpedOverTheLazyCamel`.

Try to use _Skip Word_ with ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>&#8594;</kbd> on that method.

Depending on your CamelHumps setting, your cursor either ended up on the _"Q"_ or it skipped the entire method name and ended up on the _"("_.

Return to the beginning of the method name and press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>shift</kbd> + <kbd>a</kbd>, then type `CamelHump`. There used to be a setting
named `Smart Keys: Use "CamelHumps" words` with a toggle indicator, but this disappeared since some new release around 2019.

Instead if you want to do something using the alternative CamelHumps mode, there **is** an action in the action menu for that.

These are called `Move Caret to Next Word with Selection in Different "CamelHumps" Mode` (or Previous Word, or without Selection).

They all appear when you type CamelHumps and IntelliJ remembers your last action command, so it's not all bad.

> **TIP:**  
> Other tools, like SublimeText, have different key combinations to skip the entire word (<kbd>ctrl</kbd> + <kbd>&#8594;</kbd>), or skip based on
> CamelCasing (<kbd>alt</kbd> + <kbd>&#8594;</kbd>).

## Jumping methods ![Windows](icons/glyph-windows-32.png)<kbd>alt</kbd>+<kbd>up</kbd>/<kbd>down</kbd>

In `Chapter2.java`, place your cursor at the `theQuickBrownFoxJumpedOverTheLazyCamel` method.  
Press ![Windows](icons/glyph-windows-20.png)<kbd>alt</kbd> + <kbd>&#8595;</kbd> a few times and see what happens.  
Now use ![Windows](icons/glyph-windows-20.png)<kbd>alt</kbd> + <kbd>&#8593;</kbd> to go back the way you came.

## Jump to "error" ![Windows](icons/glyph-windows-32.png)<kbd>F2</kbd>
Move to the top of the file with ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>Home</kbd> and from there press ![Windows](icons/glyph-windows-20.png)<kbd>F2</kbd>. 
This should navigate your cursor to the class named `Chapter2` because IntelliJ marks it as being _unused_.

> **TIP:**  
> If you want to see which error your IDE has detected, check out the "Problems" pane.
> You can open this message view by using the combination ![Windows](icons/glyph-windows-20.png)<kbd>Alt</kbd> + <kbd>6</kbd>

If you keep pressing ![Windows](icons/glyph-windows-20.png)<kbd>F2</kbd> it should keep cycling your cursor over the _unused_ warnings. In between the methods `jump()` and `camel()`,
paste the following:

```java
privet String kakdilla(){
        "horocho";
        }
```

Move to the top of the file again, and press ![Windows](icons/glyph-windows-20.png)<kbd>F2</kbd> once again.
Notice how the cursor now first jumps to the actual compilation error (_`privet` cannot be resolved_).

> [!NOTE]
> Cycling only happens over all actual _errors_, and the _unused warnings_ are not cycled over anymore.

## Jump into ![Windows](icons/glyph-windows-32.png) <kbd>ctrl</kbd> (+<kbd>alt</kbd>) + <kbd>b</kbd>
_"Jump into"__, or __"drill down"__ as I like to call it, allows you to follow the path the code will execute at runtime.
It is a big timesaver when attempting to follow the logic of any given program.

Right now, there's a typo in both the `EpicJumper.java` and `MehJumper.java` classes. Let's fix that.

Go to `Chapter2.jumpUsingStrategy()` and place your cursor on the `jump()` method call. Press <kbd>ctrl</kbd> <kbd>b</kbd>.
This should take you straight to the interfaces `jump()` method.

Now, let's go back to where we came from. Press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> <kbd>alt</kbd> <kbd>b</kbd>. IntelliJ knows you want to __"drill down"__ into the
actual method implementation but doesn't know which one, so download shareit will suggest some options. Select the `MehJumper` method by pressing <kbd>
&#8595;</kbd> and then <kbd>enter</kbd> and see where it leads you.

You can now correct the typo in the method, and move on to the next exercise.

## History and its importance ![Windows](icons/glyph-windows-32.png)<kbd>ctrl</kbd>+<kbd>alt</kbd>+<kbd>left</kbd>/<kbd>right</kbd>
In the previous exercise we drilled down into a method call and changed some things. But sometimes we want to go back in time (usually after
messing something up). Let's repeat the previous exercise!
If you are following this tutorial in one go, and are currently at the end-position of the previous topic, you can continue onwards from
there.

Press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>alt</kbd> + <kbd>&#8592;</kbd> to go return to your starting position.
You should now be back at the `Chapter2.java` class.

Now repeat the previous exercise, but pick the `EpicJumper` and also fix the typo. Then go back again using ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>
alt</kbd> + <kbd>&#8592;</kbd>.

Also try backtracking your backtrack by pressing ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>alt</kbd> + <kbd>&#8594;</kbd>.

> **NOTE:**  
> every time you use **Navigation shortcuts** that bring you to new classes, IntelliJ will remember this in a Navigation History of sorts.

## Jump to last edit position ![Windows](icons/glyph-windows-32.png)<kbd>ctrl</kbd>+<kbd>shift</kbd>+<kbd>backspace</kbd>
From the end of previous exercise, make sure you're back in the `Chapter2.java` class and press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>shift</kbd> + <kbd>backspace</kbd>
to return to where you were last editing.   

Try pressing the hotkey again and see what happens.

## Show in Project ![Windows](icons/glyph-windows-32.png)<kbd>alt</kbd>+<kbd>F1</kbd>
Open `MehJumper.java` by pressing ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>n</kbd>, then use ![Windows](icons/glyph-windows-20.png)<kbd>alt</kbd> + <kbd>F1</kbd> to open up the `Project` navigational
sidebar with the `MehJumper.java` class selected.

You can now use ![Windows](icons/glyph-windows-20.png)<kbd>alt</kbd> + <kbd>1</kbd> (**do not press <kbd>F1</kbd>, we mean the actual digit**) to minimize 
the sidebar and move your window focus back to your editor.

## More navigational goodness: code hierarchy transversal

Inspect the `mud` package. It's got your typical layered application where we pass around a `Ball` through all of its layers.
In order to navigate more complex code hierarchies, play around with some of these hotkeys:

Pressing ![Windows](icons/glyph-windows-20.png)<kbd>alt</kbd> + <kbd>F7</kbd> will show you how the selected element is used inside your codebase.
This shortcut works on virtually anything, be it a class, a method or a field in a separate __Tool Window__.
As an example: open `Ball.java` using <kbd>ctrl</kbd> + <kbd>n</kbd>, and press your arrow keys to navigate to the`getId()` method inside this
class.
Now press ![Windows](icons/glyph-windows-20.png)<kbd>alt</kbd> + <kbd>F7</kbd> and look at the bottom of your screen.

![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>alt</kbd> + <kbd>h</kbd> will show you the call hierarchy leading up to the element you are currently inspecting.
Repeat the previous step, but instead of inspecting an element's usage, press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>alt</kbd> + <kbd>h</kbd>.
Navigate the element tree using the arrow keys, and select any element you wish to take a closer look at with ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>
enter</kbd> (or <kbd>F4</kbd> if you want to navigate to the code without further ado).

> **TIP:**
> move this navigational __Tool Window__ to the bottom bar (next to `3: Find`), because you'll usually want to optimize your screen's
> horizontal space rather than its vertical space.

### ![Windows](icons/glyph-windows-32.png)<kbd>ctrl</kbd>+<kbd>b</kbd>
Navigate to the `return id;` line in the `Ball.java` class and put your cursor on `id`. Now press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>b</kbd>
This should navigate your code editor to the instantiation of the field itself.

Press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>b</kbd> again. This time it should show a popup asking if you want to show 
__accessors__ of the field.   

Let's go with _`Yes`_.

### Pop-up windows (but not the annoying kind) ![Windows](icons/glyph-windows-20.png) <kbd>ctrl</kbd> + <kbd>shift</kbd> + <kbd>i</kbd>

Sometimes when you are working on code, you want to quickly reference how a certain class, field or method is defined without opening a new
workspace window.
In order to do so, you can make use of the ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>shift</kbd> + <kbd>i</kbd> keyboard combination to do just so.

Other useful overlay pop-ups include: the __quick documentation__ and __quick parameter definition__ shortcuts.
Let's find out what they do! Move to any line of code, and press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>q</kbd>. The overlayed information pop-up will show
you relevant documentation of the selected code element.

Navigate to the `return id;` line in the `Ball.java` class and put your cursor on `id` again. Pressing ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>p</kbd> will
show you the relevant documentation for this parameter.
As we have not written any documentation, this overlay window will be blank.

## Jump to line ![Windows](icons/glyph-windows-32.png)<kbd>ctrl</kbd>+<kbd>g</kbd> (example with paste from stacktrace)
Here is a part of a very long stacktrace.
```bash
    java.lang.NullPointerException
      at be.swsb.productivity.chapter2.mud.service.BallServiceImpl.findBall(BallServiceImpl.java:18)
      at be.swsb.productivity.chapter2.mud.ui.BallScreen.render(BallScreen.java:15)
      at be.swsb.productivity.chapter2.mud.ui.BallScreenTest.screenCallsStuff(BallScreenTest.java:11)
      at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
      at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
      at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
      at java.lang.reflect.Method.invoke(Method.java:497)
      at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:47)
      at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
      at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:44)
      at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
      at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:271)
      at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:70)
      at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
      at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
      at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
      at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
      at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
      at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
      at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
      at org.junit.runner.JUnitCore.run(JUnitCore.java:160)
      at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:119)
      at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:42)
      at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:234)
      at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:74)
      at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
      at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
      at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
      at java.lang.reflect.Method.invoke(Method.java:497)
      at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)
```

Let's see where the NullPointer is occurring. Open `BallServiceImpl`, using ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>g</kbd>.
Now use ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>g</kbd> and enter the desired line number (this is line nr. `18`), as the stacktrace above states the error
occurs on this line: `at be.swsb.productivity.chapter2.mud.service.BallServiceImpl.findBall(BallServiceImpl.java:18)`

## Navigate to method ![Windows](icons/glyph-windows-32.png)<kbd>ctrl</kbd>+<kbd>F12</kbd>
### Paste from stacktrace
Another way of navigating to the location of the code causing our NullPointer exception, albeit less precise, is to first copy the method
name from the stacktrace, in this case `findBall`.
Next, open `BallServiceImpl.java`, using ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>n</kbd>. Now press ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>F12</kbd>. This lists all methods of a
class.

To navigate to the suspicious method: paste the name we copied from the stacktrace into the method list popup window.
You can then press ![Windows](icons/glyph-windows-20.png)<kbd>Enter</kbd> to navigate to that method.

> **TIP:**    
> You can also use the <kbd>ctrl</kbd> + <kbd>F12</kbd> shortcut to get a quick overview of the contents of a file.
> This works well even in non-Java files. As an example, try out the combination inside the source code of this text (`chapter2.md`)
  
### Quick check equals impl

Let's imagine we want to write a comparator for some object, or want to use it in a Set. You'll want to take a look at that objects `equals()` implementation. In case the object is filled to the brim with other methods, 
it might be easier to tap ![Windows](icons/glyph-windows-20.png)<kbd>ctrl</kbd> + <kbd>F12</kbd> to check for an `equals` method. If you can't find it on your first try, tap <kbd>ctrl</kbd> + <kbd>F12</kbd> again
to browse the methods of the superclass as well.  

Let's open `RealBall.java`, and try to find out if this class has its own `equals` and `hashcode` implementations, or wether makes use of
its superclass implementations.

---
  

[_Next Chapter_](chapter3.md)  

[_Back to outline_](outline.md)