Paidy Talks
===========

Public talks given by different speakers in representation of [Paidy Engineering](https://engineering.paidy.com/).

- [Up your MTL game with classy optics](https://paidy.github.io/talks/scalar2019/) by [Gabriel Volpe](https://github.com/gvolpe) at the [Scalar 2019 - Warsaw, Poland](http://scalar-conf.com/).
- [Haskell for Scala developers](https://paidy.github.io/talks/tokyo2019-haskell/) by [Gabriel Volpe](https://github.com/gvolpe) at the [Tokyo Scala Developers Meetup](https://www.meetup.com/Tokyo-Scala-Developers/).
- [Cats Effect, tagless final & beyond!](https://paidy.github.io/talks/scalax2018/) by [Gabriel Volpe](https://github.com/gvolpe) at [Scala eXchange 2018 - London, UK](https://skillsmatter.com/conferences/10488-scala-exchange-2018).
- [Cats Effect: The IO Monad for Scala](https://paidy.github.io/talks/scalaio2018/) by [Gabriel Volpe](https://github.com/gvolpe) at [Scala IO 2018 - Lyon, France](https://scala.io/).
- [NeoVim + Scala](https://paidy.github.io/talks/tokyo2018-nvim-scala/) by [Paul Roseau](https://github.com/paulroseau) at the [Tokyo Scala Developers Meetup](https://www.meetup.com/Tokyo-Scala-Developers/).
- [Eff: One Monad to rule them all!](https://paidy.github.io/talks/tokyo2018-eff/) by [James Carragher](https://github.com/jcarrag) at the [Tokyo Scala Developers Meetup](https://www.meetup.com/Tokyo-Scala-Developers/).
- [Introduction to Monads](https://paidy.github.io/talks/tokyo2018-monads/) by [Haemin Yoo](https://github.com/yoohaemin) at the [Tokyo Scala Developers Meetup](https://www.meetup.com/Tokyo-Scala-Developers/).
- [Cats Effect: The IO Monad for Scala](https://paidy.github.io/talks/tokyo2018-cats-effect/) by [Gabriel Volpe](https://github.com/gvolpe) at the [Tokyo Scala Developers Meetup](https://www.meetup.com/Tokyo-Scala-Developers/).
- [Building a REST API using Http4s (Abstracting over the effect type)](https://paidy.github.io/talks/scalamatsuri2018/) by [Gabriel Volpe](https://github.com/gvolpe) at [Scala Matsuri 2018](http://2018.scalamatsuri.org/index_en.html).

Adding your own talk
=====

### Setup

- Copy `/template` to `/$year-month-day/$your-talk-title`.
- Take a look at the other templates to see how to structure `./index.html` and `*.md` files.
- Use `./assets` for local assets, and [`/docs/assets`](https://github.com/paidy/talks/tree/master/docs/assets) for 'global' Paidy assets.
- Add your talk to the list of talks in the [project README](https://github.com/paidy/talks/blob/master/README.md).

### How to start the server

You need to install `nodejs` and `npm`.

```bash
> cd /$date/$title
> npm install
> npm start
```

Server will start at http://localhost:8000.

### How to print your slides

Loading `http://localhost:8000/?print-pdf/gi` in a browser will render your slides in a format suitable for printing or PDF download
