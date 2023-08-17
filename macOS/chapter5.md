# Chapter 5 - Embedded Windows
[_Back to outline_](outline.md)

IntelliJ has various _Tool Windows_, like the `1: Project` window, `9: Version Control` window, or `3: Find` window.
When one of these _embedded_ windows have focus, other shortcuts are available.

In this section we'll discuss some of them.

## Opening/Closing (Toggling) ![Mac](./icons/glyph-apple-32.png)<kbd>&#8984;</kbd>
All of these windows are accessible by holding down ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> and pressing the associating number.
e.g. If you want to open or close the `1: Project` window, you press ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> + <kbd>1</kbd>.

## Switching tabs ![Mac](./icons/glyph-apple-32.png)<kbd>&#8984;</kbd> + <kbd>shift</kbd> + <kbd>[</kbd>/<kbd>]</kbd>
Some of these windows have multiple tabs in them, i.e. the `6: TODO` window. So let's open that window, using ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> + <kbd>6</kbd>.
You'll notice that it contains the _Project_, _Current File_, _Scope Based_ and _Default Changelist_ tabs.
You can switch between these tabs by pressing ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> + <kbd>
shift</kbd> + <kbd>[</kbd> and <kbd>&#8984;</kbd> + ![Mac](./icons/glyph-apple-20.png)<kbd>shift</kbd> + <kbd>]</kbd>.

Give it a try!

## Navigation from Embedded Windows ![Mac](./icons/glyph-apple-32.png)<kbd>&#8997;</kbd> + <kbd>enter</kbd> vs. ![Mac](./icons/glyph-apple-32.png)<kbd>&#8984;</kbd> + <kbd>&#x2191;</kbd>
Some Tool Windows will display results, like `3: Find` and `8: Hierarchy`, which you can use to navigate to directly.

There's two ways of doing this:

* ![Mac](./icons/glyph-apple-20.png)<kbd>&#8997;</kbd> + <kbd>enter</kbd>: allows you to navigate to your selected result, but focus remains on your Tool Window
* ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> + <kbd>&#x2191;</kbd>: navigates to your selected result AND focuses the editor window in one go.

Let's try 'em both out.

We want to follow the path the code takes at runtime until we get to `CoffeeBeans.scent()`, so let's trace back our steps from there by
opening `CoffeeBeans.java`, and ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> + <kbd>&#8997;</kbd> + <kbd>F7</kbd> on the `scent()` method.

Use ![Mac](./icons/glyph-apple-20.png)<kbd>&#8997;</kbd> + <kbd>enter</kbd> on `CoffeeSmeller.smell()`, see where it takes you, then <kbd>ctrl</kbd> + <kbd>enter</kbd>
on `Chapter5.smellBeans()`.

We figured out we want to change something in `CoffeeSmeller`, so select `CoffeeSmeller` in the `8: Hierarchy` tool window and instead of
pressing ![Mac](./icons/glyph-apple-20.png)<kbd>&#8997;</kbd> + <kbd>enter</kbd>, press ![Mac](./icons/glyph-apple-20.png)<kbd>&#8984;</kbd> + <kbd>&#x2191;</kbd>.

Now we can change the implementation.

## Why resizing is for dummies ![Mac](./icons/glyph-apple-32.png)<kbd>shift</kbd> + <kbd>&#8984;</kbd> + <kbd>F12</kbd>
Stop resizing your _Tool Windows_, use them when you need them (see _Opening/Closing (Toggling)_).

If you don't need your _Tool Window_, you'll want to focus back on your editor window. You can do this from anywhere (meaning, from any
focussed _Tool Window_) by pressing ![Mac](./icons/glyph-apple-20.png)<kbd>shift</kbd> + <kbd>&#8984;</kbd> + <kbd>F12</kbd>.

So, let's first imagine we were looking at a hierarchy of `CoffeeBeans.scent()`, we looked at `CoffeeSmeller`'s use and we checked where in
the package structure `CoffeeSmeller` was situated by pressing ![Mac](./icons/glyph-apple-20.png)<kbd>&#8997;</kbd> + <kbd>F1</kbd>.

Now we have both the `1: Project` and `8: Hierarchy` _Tool Windows_ open. But we want to continue tweaking the CoffeeSmellers code, so let's
press ![Mac](./icons/glyph-apple-20.png)<kbd>shift</kbd> + <kbd>&#8984;</kbd> + <kbd>F12</kbd> and get our focus back on where it belongs, without any distractions.

Happy editing!

---

[_Next Chapter_](chapter6.md)
[_Back to outline_](outline.md)