# Chapter 2 - Navigation
[_Back to outline_](outline.md)
## Word-skipping `ctrl+arrows`
Open Chapter2.java, place your cursor in front of the `The` of the popular phrase, and tap `ctrl+right` 8 times.

You should now have your cursor at the beginning of the word `camel`.

## Begin/End of Line `home`, `end`
Still in Chapter2.java, place your cursor at the start of the popular phrase, and do `end`.
Press `home` once, look at your position, then press `home` again and see what happens.
Press `home` one more time and again look at what happens.

If you wanna see a stroboscope effect, put your cursor at the beginning of the word `return`, hold down `shift+home`. ;)

## Begin/End of File `ctrl+home`, `ctrl+end`
Try out `ctrl+home` and `ctrl+end` in Chapter2.java.

## CamelHumps (+ how to toggle)
In Chapter2.java, put your cursor at the beginning of the method `theQuickBrownFoxJumpedOverTheLazyCamel`.

Try to use _Skip Word_ with `ctrl+right` on that method.

Depending on your CamelHumps setting, your cursor either ended up on the `Q` or it skipped the entire method name and you ended up on the `(`.

Return to the beginning of the method name and press `ctrl+shift+a`, then type `CamelHump`. There should be a setting `Smart Keys: Use "CamelHumps" words` with a toggle button.

Navigate to that option and select it by pressing `Enter`, then press `Escape` to cancel out of the action menu.

Try to use _Skip Word_ again with `ctrl+right`.

Other tools, like SublimeText, have different key combination to skip the entire word (`ctrl+right`), or skip based on CamelCasing (`alt+right`).

## Jumping methods (`alt+up,down`)
Put your cursor at the `theQuickBrownFoxJumpedOverTheLazyCamel` method.

Keep pressing `alt+down` and see what happens.

Keep pressing `alt+up` and see what happens.

## Jump to "error" `F2`
Move to the top of the file with `ctrl+Home` and from there press `F2`.

This should navigate your cursor to the class name `Chapter2` because IntelliJ marks it as _unused_.

If you keep pressing `F2` it should keep cycling your cursor over the _unused warnings_.

In between the methods `jump()` and `camel()`, paste the following:

```
privet String kakdilla() {
    "horocho";
}
```

Move to the top of the file again, and press `F2` once again.

Notice how the cursor now first jumps to the actual compilation error (`privet` cannot be resolved).

Cycling also happens only over all the actual _errors_, and _unused warnings_ are not cycled anymore.

## Jump into `ctrl(+alt)+b`
Jump into, or "drill down" as I like to call it, allows you to follow the path that code execution makes at runtime.

Right now, there's a typo in both the `EpicJumper.java` and `MehJumper.java` classes. Let's fix that.

Go to Chapter2.jumpUsingStrategy() and place your cursor on the jump() method call. Press `ctrl+b`, this should bring you to the interfaces `jump()` method.

Now go back to where you came from, and press `ctrl+alt+b`. IntelliJ knows you want to "drill down" into the actual method implementation but doesn't know which one, so it will suggest two options. Pick the `MehJumper` by pressing `down` and then `enter` and see where it leads you.

Then correct the typo and move on to the next exercise.

## History and its importance `ctrl+alt+left,right`
In the previous exercise we drilled down into a method call and changed stuff, but sometimes you want to trace back your steps.

Repeat the previous exercise, or if you're still at the last position of the previous exercise you can continu on from there.

Press `ctrl+alt+left` to go back where you came from. This should have brought you back to the `Chapter2.java` class.

Now repeat the previous exercise, but pick the `EpicJumper` and also fix the typo. Then go back again using `ctrl+alt+left`.

Also try backtracking your backtrack by pressing `ctlr+alt+right`.

**Please note**: every time you use Navigation shortcuts that bring you to new classes, IntelliJ will remember this in a sort of Navigation History.

## Jump to last edit position `ctrl+shift+backspace`
From the end of previous exercise, make sure you're back in the `Chapter2.java` class and press `ctrl+shift+backspace` to go back to where you were last editing.

Try pressing it again and see what happens.

## Show in Project `alt+F1`
Open `MehJumper` by pressing `ctrl+n`, then press `alt+F1`. It should open up the `Project` sidebar with MehJumper selected.

Press `alt+1` (**not F1**) to minimize the sidebar and get focus back to your editor.

## `alt+F7` vs. `ctrl+alt+h` vs. `ctrl+b`
Checkout the `mud` package. It's got your typical layered application where we pass around a `Ball` through all of the layers.

Let's see what the different shortcuts mentioned in the title actually do.

### `alt+F7`
This shows the usage of anything, be it a class, a method or a field in a separate _Tool Window_.

Open (`ctrl+n`) `Ball.java`, navigate to `getId()` and press `alt+F7`.

### `ctrl+alt+h`
This shows the call hierarchy of how code got to the place you're starting from.

Repeat the previous exercise, but instead press `ctrl+alt+h`.

Navigate the tree with the arrow keys, and select with `ctrl+enter` (or `F4` if you directly want to navigate to the code).

Pro-tip: move this _Tool Window_ to the bottom bar (next to `3: Find`), because you'll usually want horizontal space instead of vertical.

### `ctrl+b`
This will show the usage in a popup window (`Escape`able).

Particularly handy to show read or write usage on a field.

Navigate to the `return id;` and put your cursor on `id`.

Press `ctrl+b` once, this should navigate to the field itself.

Press `ctrl+b` again, now it should show a popup asking if you want to show accessors of the field. Let's go with _Yes_. :)

## Jump to line `ctrl+g` (example with paste from stacktrace)
Here's a strip of a stacktrace.

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

Let's see where the NullPointer is occurring and open `ctrl+n` BallServiceImpl, and use `ctrl+g` to enter line `18`, as it states in the second line of the Stacktrace.

## Navigate to method `ctrl+F12`
### Paste from stacktrace
Another way of navigating to the place where the NullPointer occurs, albeit less exact, is to first copy the method from the stacktrace, in this case `findBall`.

Then open `ctrl+n` BallServiceImpl, press `ctrl+F12`, which lists all methods of a class, and paste the method from the stacktrace in that popup window. You can then press `Enter` and navigate to that method.

### Quick check equals impl
Want to write a comparator for some object, or want to use it in a Set? You'll want to know about that objects `equals()` implementation.

If that object is chock full of other methods, it might be easier to tap `ctrl+F12` to check for an equals implementation. If you can't find it from the first try, tap `ctrl+F12` again to browse the methods of the superclass as well.

Let's open `RealBall` with `ctrl+n`, and try to find out if this class has its own `equals` and `hashcode` implementation, or if it uses its superclass implementations.

[_Back to outline_](outline.md)