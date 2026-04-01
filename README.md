# 🎮 VelhaJogo

<div align="center">

[![Android](https://img.shields.io/badge/Android-14+-3DDC84?logo=android&logoColor=white)](https://www.android.com/)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.9+-7F52FF?logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![License](https://img.shields.io/badge/License-MIT-blue)](LICENSE)

**A simple and fun Tic-Tac-Toe game for Android** 🎯

[English](#-english) • [Português](#-português)

</div>

---

## 🇬🇧 English

### 📱 Overview
VelhaJogo is a simple Android tic-tac-toe game built with Kotlin. It is a local two-player game where players take turns placing `X` and `O` on a 3x3 board. The app keeps score across matches, detects wins and draws, highlights the winning line, and lets you restart the current game at any time.

### ✨ Implemented features

| Feature | Description |
|---------|-------------|
| 👥 **2-Player Mode** | Local gameplay on the same device |
| 🔄 **Turn Alternation** | Automatic switch between `X` and `O` |
| 🏆 **Win Detection** | All 8 possible tic-tac-toe combinations |
| 🤝 **Draw Detection** | Board full detection |
| 📊 **Score Tracking** | Keep score for `X`, `O`, and draws |
| ✅ **Visual Highlight** | Winning cells highlighted in gold |
| 🔄 **Reset Button** | Start new matches anytime |
| 🎨 **Dark Theme** | Custom styled board and buttons |

### 📋 Requirements

- ✅ Android Studio 2024.1+
- ✅ Android SDK 36 or compatible tools
- ✅ Java 11
- ✅ Android device or emulator (API 24+)

### 🚀 How to run the project

#### 📥 Step 0: Clone the repository

First, clone the project from GitHub:

```powershell
git clone https://github.com/AlexssanderCastro/JogoDaVelha.git
cd JogoDaVelha
```

Or download as ZIP and extract it.

#### 📌 Option 1: Run from Android Studio (Recommended)

1. 📂 Open Android Studio
2. 📁 Select **File → Open** and choose the cloned `JogoDaVelha` folder
3. ⏳ Wait for Gradle sync to complete
4. 📥 Android Studio will prompt to download SDK if needed
5. 📱 Select a device or start an emulator
6. ▶️ Click **Run** (green play button) to build and launch

#### 💻 Option 2: Run with Gradle from Terminal

1. 🖥️ Open PowerShell in the project root directory
2. 🔨 Build the debug APK:

   ```powershell
   .\gradlew.bat assembleDebug
   ```

3. 📲 Install on device/emulator:

   ```powershell
   .\gradlew.bat installDebug
   ```

4. 🎮 Launch the app from your device launcher

### 📁 Project Structure

| Path | Description |
|------|-------------|
| `app/src/main/res/layout/activity_main.xml` | 🎨 Main UI layout |
| `app/src/main/java/com/example/velhajogo/MainActivity.kt` | 🎮 Game logic & mechanics |
| `app/src/main/res/drawable/` | 🖼️ Styles & visual assets |
| `app/build.gradle.kts` | ⚙️ Project configuration |

**Package Name:** `com.example.velhajogo`

---

## 🇧🇷 Português

### 📱 Visão geral
O VelhaJogo é um jogo da velha para Android desenvolvido em Kotlin. Trata-se de um jogo local para dois jogadores no mesmo aparelho, em que os participantes alternam entre `X` e `O` em um tabuleiro 3x3. O aplicativo mantém o placar entre as partidas, identifica vitórias e empates, destaca a sequência vencedora e permite reiniciar a partida a qualquer momento.

### ✨ Recursos implementados

| Recurso | Descrição |
|---------|-----------|
| 👥 **Modo 2 Jogadores** | Jogo local no mesmo dispositivo |
| 🔄 **Alternância de Turnos** | Troca automática entre `X` e `O` |
| 🏆 **Detecção de Vitória** | Todas as 8 combinações possíveis |
| 🤝 **Detecção de Empate** | Identificação de tabuleiro cheio |
| 📊 **Controle de Placar** | Rastreamento de `X`, `O` e empates |
| ✅ **Destaque Visual** | Células vencedoras em ouro |
| 🔄 **Botão Reiniciar** | Comece novas partidas a qualquer hora |
| 🎨 **Tema Escuro** | Design moderno e personalizado |

### 📋 Requisitos

- ✅ Android Studio 2024.1+
- ✅ Android SDK 36 ou ferramentas compatíveis
- ✅ Java 11
- ✅ Dispositivo Android ou emulador (API 24+)

### 🚀 Como executar o projeto

#### 📥 Passo 0: Clone o repositório

Primeiro, clone o projeto do GitHub:

```powershell
git clone https://github.com/AlexssanderCastro/JogoDaVelha.git
cd JogoDaVelha
```

Ou baixe como ZIP e extraia.

#### 📌 Opção 1: Executar pelo Android Studio (Recomendado)

1. 📂 Abra o Android Studio
2. 📁 Vá em **File → Open** e selecione a pasta `JogoDaVelha` clonada
3. ⏳ Aguarde a sincronização do Gradle terminar
4. 📥 O Android Studio solicitará download do SDK se necessário
5. 📱 Selecione um dispositivo ou inicie um emulador
6. ▶️ Clique em **Run** (botão play verde) para compilar e executar

#### 💻 Opção 2: Executar com Gradle no Terminal

1. 🖥️ Abra o PowerShell na raiz do projeto
2. 🔨 Compile o APK de debug:

   ```powershell
   .\gradlew.bat assembleDebug
   ```

3. 📲 Instale no dispositivo/emulador:

   ```powershell
   .\gradlew.bat installDebug
   ```

4. 🎮 Inicie o app pela tela inicial do dispositivo

### 📁 Estrutura do Projeto

| Caminho | Descrição |
|---------|-----------|
| `app/src/main/res/layout/activity_main.xml` | 🎨 Layout principal da UI |
| `app/src/main/java/com/example/velhajogo/MainActivity.kt` | 🎮 Lógica e mecânicas do jogo |
| `app/src/main/res/drawable/` | 🖼️ Estilos e ativos visuais |
| `app/build.gradle.kts` | ⚙️ Configuração do projeto |

**Nome do Pacote:** `com.example.velhajogo`

---

## 🎓 Stack Tecnológico

```
┌─────────────────────────────┐
│   VelhaJogo App             │
├─────────────────────────────┤
│  • Kotlin                   │
│  • Android SDK 36           │
│  • AndroidX                 │
│  • ConstraintLayout         │
│  • AppCompat                │
└─────────────────────────────┘
```

---

## 💡 Gameplay Quick Guide

| Ação | Resultado |
|------|-----------|
| 🖱️ Toque em uma célula | Marca com X ou O |
| 🏁 Três seguidas | Jogador venceu! |
| 📊 Sem espaço | Empatou (Deu Velha!) |
| 🔄 Botão Reiniciar | Nova partida (placar mantido) |

---

<div align="center">

### ⭐ Aproveite o jogo! / Enjoy the game!

**Made with ❤️ using Kotlin & Android**

</div>





