# JDK Installation Guide

This guide provides step-by-step instructions to install the Java Development Kit (JDK) on **Windows**, **Linux**, and **macOS**. It is designed to be clear, professional, and beginner-friendly.

---

## 1. Windows

### Step 1: Download JDK

- Go to the official Oracle JDK download page: [Oracle JDK Downloads](https://www.oracle.com/java/technologies/javase-downloads.html)
- Select the latest **LTS (Long-Term Support)** version (recommended).
- Download the **Windows x64 Installer (.exe)**.

### Step 2: Install JDK

1. Run the downloaded installer.
2. Follow the installation wizard (click *Next* → *Next* → *Install*).
3. By default, JDK will be installed in:
   ```
   C:\Program Files\Java\jdk-<version>
   ```

### Step 3: Configure Environment Variables

1. Open **Start Menu → Search "Environment Variables" → Edit the system environment variables**.
2. Click **Environment Variables…**.
3. Under **System variables**, click **New**:
   - Variable name: `JAVA_HOME`
   - Variable value: `C:\Program Files\Java\jdk-<version>`
4. Edit the `Path` variable → Add:
   ```
   %JAVA_HOME%\bin
   ```

### Step 4: Verify Installation

Open **Command Prompt (cmd)** and run:

```bash
java -version
javac -version
```

You should see the installed JDK version.

---

## 2. Linux

### Step 1: Update Package Index

```bash
sudo apt update   # For Debian/Ubuntu
sudo dnf check-update   # For Fedora
```

### Step 2: Install JDK

- **Debian/Ubuntu**:
  ```bash
  sudo apt install openjdk-17-jdk -y
  ```
- **Fedora/RHEL/CentOS**:
  ```bash
  sudo dnf install java-17-openjdk-devel -y
  ```
- **Arch Linux**:
  ```bash
  sudo pacman -S jdk17-openjdk
  ```

### Step 3: Set JAVA\_HOME

Add the following to your shell configuration file (`~/.bashrc` or `~/.zshrc`):

```bash
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk
export PATH=$JAVA_HOME/bin:$PATH
```

Then apply changes:

```bash
source ~/.bashrc   # or source ~/.zshrc
```

### Step 4: Verify Installation

```bash
java -version
javac -version
```

---

## 3. macOS

### Step 1: Install Homebrew (if not installed)

Homebrew is the package manager for macOS.

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

### Step 2: Install JDK

Using Homebrew:

```bash
brew install openjdk@17
```

### Step 3: Configure JAVA\_HOME

Add the following to your `~/.zshrc` (for zsh) or `~/.bash_profile` (for bash):

```bash
export JAVA_HOME="$(/usr/libexec/java_home -v 17)"
export PATH=$JAVA_HOME/bin:$PATH
```

Then reload your shell:

```bash
source ~/.zshrc   # or source ~/.bash_profile
```

### Step 4: Verify Installation

```bash
java -version
javac -version
```

---

## Notes

- Replace **17** with the latest JDK version if necessary.
- Oracle JDK and OpenJDK are both fine; OpenJDK is open-source and widely used.
- Always prefer the **LTS (Long-Term Support)** release for production use.

---

✅ Now your system is ready to run Java applications and develop projects with JDK.

