# tnoda.yubari

A Clojure library and server settings designed for tnoda to play Minecraft.


## Dependencies

Download and install CanaryMod into your local repository (`~/.m2`) using the [lein-localrepo](https://github.com/kumarshantanu/lein-localrepo) Leiningen plugin.

    $ lein localrepo install canarymod.jar local/canarymod 1.2.0


## Usage

Create a file `eula.txt` in a project-root directory.

    $ lein run

If you agree to Mojang's End-User License Agreement (EULA), edit the `eula.txt` file.

Then start your CanaryMod server from the command line.

    $ lein run

Or start the server from REPL

    $ lein repl
    
    user=> (tnoda.yubari/-main)


## Commands

+ `/hello`
+ `/echo`
+ `/eval`


## License

Copyright © 2015 Takahiro Noda

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
