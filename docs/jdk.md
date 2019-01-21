# Install a JVM

If you don't already have a JDK installed, I recommand to use asdf to sandbox your environment

1. Install [asdf](https://github.com/asdf-vm/asdf)
2. Install [asdf-java](https://github.com/skotchpine/asdf-java)
3. Get JDK11 (required for Kotlin dev) : `asdf install java openjdk-11.0.1`
4. Set you JDK version :
   - Set a global version : `asdf global java openjdk-11.0.1`
   - Set a local version : `asdf local java openjdk-11.0.1`

Later you can easily use other version. Exemple :

- Install JDK8 (required for Android dev) : `asdf install java oracle-8.191`
- Set a global version : `asdf global java oracle-8.191`
