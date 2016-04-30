# Chapter 5 - Embedded Windows
[_Back to outline_](outline.md)

IntelliJ has various _Tool Windows_, like the `1: Project` window, `9: Version Control` window, or `3: Find` window. When one of these _embedded_ windows have focus, other shortcuts are available.

In this topic we'll talk about some of them.

## Opening/Closing (Toggling) ![Windows](icons/glyph-windows-32.png)`alt+number` ![Windows](icons/glyph-windows-32.png)`ctrl+F4`
All of these windows are accessible by holding down ![Windows](icons/glyph-windows-20.png)`alt` and pressing the associating number.
e.g. If you want to open or close the `1: Project` window, you press ![Windows](icons/glyph-windows-20.png)`alt+1`.

## Switching tabs ![Windows](icons/glyph-windows-32.png)`alt+left,right`
Some of these windows have multiple tabs in them, i.e. the `6: TODO` window. So let's open that with ![Windows](icons/glyph-windows-20.png)`alt+6`.

You'll notice that it contains the _Project_, _Current File_, _Scope Based_ and _Default Changelist_ tabs.

You can switch between these tabs by pressing ![Windows](icons/glyph-windows-20.png)`alt+right` and ![Windows](icons/glyph-windows-20.png)`alt+left`.

Give it a try!

## Navigation from Embedded Windows ![Windows](icons/glyph-windows-32.png)`ctrl+enter` vs. ![Windows](icons/glyph-windows-32.png)`F4`
Some Tool Windows will display results, like `3: Find` and `8: Hierarchy`, which you can use to navigate to directly.

There's two ways of doing this:
* ![Windows](icons/glyph-windows-20.png)`ctrl+enter`: allows you to navigate to your selected result, but focus remains on your Tool Window
* ![Windows](icons/glyph-windows-20.png)`F4`: navigates to your selected result AND focuses the editor window in one go.

Let's try 'em both out.

We want to follow the path the code takes at runtime until we get to `CoffeeBeans.scent()`, so let's trace back our steps from there by opening `CoffeeBeans.java`, and ![Windows](icons/glyph-windows-20.png)`ctrl+alt+h` on the `scent()` method.

![Windows](icons/glyph-windows-20.png)`ctrl+enter` on `CoffeeSmeller.smell()`, see where it takes you, then ![Windows](icons/glyph-windows-20.png)`ctrl+enter` on `Chapter5.smellBeans()`.

We figured out we want to change something in `CoffeeSmeller`, so select `CoffeeSmeller` in the `8: Hierarchy` tool window and instead of pressing ![Windows](icons/glyph-windows-20.png)`ctrl+enter`, press `F4`.

Now we can change the implementation.

## Why resizing is for dummies ![Windows](icons/glyph-windows-32.png)`ctrl+shift+F12`
Stop resizing your _Tool Windows_, use them when you need them (see _Opening/Closing (Toggling)_).

If you don't need your _Tool Window_, you'll want to focus back on your editor window. You can do this from anywhere (meaning, from any focussed _Tool Window_) by pressing ![Windows](icons/glyph-windows-20.png)`ctrl+shift+F12`.

So, let's first imagine we were looking at a hierarchy of `CoffeeBeans.scent()`, we looked at `CoffeeSmeller`'s use and we checked where in the package structure `CoffeeSmeller` was situated by pressing ![Windows](icons/glyph-windows-20.png)`alt+F1`.

Now we have both the `1: Project` and `8: Hierarchy` _Tool Windows_ open. But we want to continue tweaking the CoffeeSmellers code, so let's press ![Windows](icons/glyph-windows-20.png)`ctrl+shift+F12` and get our focus back on where it belongs, without any distractions.

Happy editing!

[_Next Chapter_](chapter6.md)

[_Back to outline_](outline.md)