Webcrank
========

Webcrank is an ambitious project to build a fast, reliable and
__correct__, HTTP toolkit.

This project forms the core of the Scala implementation.

See <https://github.com/webcrank/webcrank> for more details.


Build
-----

[Travis](https://travis-ci.org/webcrank/webcrank.scala) [![Build Status](https://travis-ci.org/webcrank/webcrank.scala.png)](https://travis-ci.org/webcrank/webcrank.scala)


Development
-----------

In order to organise development, this project relies heavily on
[github issues](https://github.com/webcrank/webcrank.scala/issues). Anything
that needs to be done should be added as an issue. The issues
currently follow a few conventions, such as the inclusion of a task
list that defines all the work to be done. These lists often include a
set of standard clean-up tasks that need to be checked for something
to be done, a.k.a. _proper_ done. The clean up tasks are normally
things like `Tests`, `Doc`, `Benchmark` and `FIX Sweep`.

There are not too many rules for the code. Just keep it neat and tidy,
and don't be upset if someone sweeps in after you to do re-organisation.

For those that want some guidance here are some obvious rules (but
always remember good, read as: verifiably correct, code is more
important then the rules):
 * Types are good.
 * Tidy is good.
 * Duplication is bad.
 * Abstract is better than specific.
 * Fast is better than slow.
 * But, __correct__ is better than everything.
 * Mark any transitory, experimental or questionable code with a FIX tag.
 * Try to do a sweep for FIX tags before marking anything as done.


Dependencies
------------

It would be nice to keep these down, but if something is really needed
pull it in. `scalaz`, `shapeless` and `scalaz-contrib` related things
are fine. _name your rubbish java library here_ should be
avoided.


Collaboration
-------------

If you want to get involved, anything is helpful, so don't be shy. If you
are looking for something small to start with:
 * The issues page should be full of things to look at.
 * Grab the code and grep for FIX, some of them will just be
   questions, but there should be some low hanging fruit.
 * Help with planning is always appreciated. Look at webmachine and
   what we are missing. Describing features required to implement
   the debugging tools would be incredibly useful.
 * Tests and benchmarks.
 * Fix any spelling mistakes, because my ineptitude at programming without
   types is only exceeded by my spelling and grammar ability.

If you are looking for something big, even better, but it might be worth
letting someone know what you are working on so there are no clashes. If
it is helpful, yell and you can get a commit bit to create a branch for
what ever you want to work on.
