# Android Prework - *Funny App*

Submitted by: **Angel Garcia (Detective Pikachu)**

Funny App

Time spent: **3** hours spent in total

## Required Features

The following **required** functionality is completed:

* [ x ] Image and introductory message displayed on screen
* [ x ] Button displayed on screen
* [ x ] Toast with message appears when button is pressed

The following **optional** features are implemented:

* [ x ] List anything else that you can get done to improve the app functionality!

- [ x ] Clicking Button plays funny music with funny meme
- [ x ] Clicking in a particular spot triggers funny view
- [ x ] After funny meme view after some time it goes to another view (timed view)
- [ x ] YES OR NO

## Video Walkthrough

Here's a walkthrough of implemented features:

First screen

![image](https://github.com/FrenzyExists/FunnyApp/assets/47986470/8cdf169d-d323-4dda-b49b-a92f24cda324)

Also I had a hard time trying to record since my laptop ran in some issues due to low memory, so, the other two
screens would be sort of a surprise (sorry)

HINT: touch Pikachu's nose for funny surprise

## Notes

Describe any challenges encountered while building the app.

The pre-work was not hard. There was a lot of material to read, and I made sure to do the extra 
work of reading the additional info to better understand the features I could use when I develop 
apps more seriously. That said, I did encountered some issues. For some reason my android emulator 
didn't run, so after some googling I found that the issue is that my laptop doesn't have much space 
left. At the time of writing this I have a 256GB drive almost full, with 2GB left. Blame the VM I 
have to use for the TA stuff I do. Solution was to just use my phone. I didn't realize there was a 
guide in the codepath on how to set it up so I just looked on YT, set my phone as dev mode, and 
paired it via wifi because I couldn't find a charging cable and I use my laptops' charging cable 
to charge my phone as well. Don't ask why. I took a bunch of breaks while doing the pre-work since 
I had other extra-curriculars, college courses, job as TA and webmaster, and the human need to touch
some grass. The video was straight to the point and had no issues following, barely needed to pause, 
only when I wanted to take a break. 

Another issue I had was with images. I wasted around 10 to 15 minutes of debugging on why the image
did not appeared. Turns out it was because I was using the wrong attribute. Basically:

```
<!-- Used this -->
tools:srcCompat="@drawable/me"
```

```
<!-- Instead of this -->
android:src="@drawable/me"
```

Simple solution for simple problem, had worse in other projects.

### Da BONUZ

Oh boi. I had a few ideas for this one, but due to time constrains I had to keep it simple short.
First thing I wanted to do is to add a funny sound whne I click to a particular place. This translated
to going from stackoverflow after stackoverflow because almost everything was in java and it wasn't 
a 1 to 1 translation as advertised. After like half an hour I found a medium article that showed a
way to get it working on kotlin without the IDE complaining that I needed to override some unrelated
method.

Next came the G I F S

For this one the idea was that instead of appearing a toast with a message, I instead get a toast
with a counter that will then bring me to a new view that after some funny music with funny jpeg 
played it will bring me back to the main activity. This meant that I will be able to learn a bit
more about the life cycle of an activity app rather than reading the 15+ minute articles I ended
reading anyways, even if its for Java (and a lot of stuff changed).

Then it came switching to another activity... oh boi... what a piece of work

I first thought it was this: `setContentView(R.layout.activity_funny);`, which did got me to the 
view I wanted, but it didn't triggered the callbacks I set. After some googling (lots of it) I 
found that i had to do this instead

```kotlin
val intent = Intent(this,  FunnyActivity::class.java)
startActivity(intent)
```         

Another challenge I got was gifs. The android API I was using did not support `AnimatedImageDrawable`,
so I had no other choice but to learn how to install things in android studio. Fortunately, it was
similar to how it was done for Java projects and just like minecraft it used the Gradle build. Funny
meme is a success, sort of. Its a step on the right direction.

Friends had a laugh with the app, now I am bound to do meme apps for the rest of my life. 
Its joever 😔

## License

    Copyright 2024 Detective Pikachu

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.



