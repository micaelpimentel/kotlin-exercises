# Como Testar Android Auto 

O programa Desktop Head Unit (DHU) permite que a sua máquina de desenvolvimento emule uma tela de carro com Android Auto de modo que seja possível testar um app do Android Auto. Ele está disponível para Windows, Mac e Linux.

- [Instalar DHU](#instalar)
- [Mudar o canal de atualização do AS](#mudar-canal)
- [Rodando o DHU](#rodar-dhu)

## Instalar DHU<a name="instalar"/>

A versão mais recente do DHU é a 2.0.

Siga esses passos para instalar o DHU na sua máquina:

- Antes de tudo, certifique-se de que o modo de desenvolvedor esteja habilitado e a versão do Android do seu dispositivo seja 6.0 (API 23) ou superior
- Compile e instale o app no dispositivo
- Instale o Android Auto no dispositivo. Se o Android Auto ja estiver instalado, certifique-se de que esteja atualizado com a versão mais recente.
- Configure o Android Studio para usar o canal de atualizações beta (mostrado no ). Se aparecer uma solicitação para atualizar o Android Studio, pode ignorar.
- Abra o **SDK Manager**, e navegue até a aba **SDK Tools**, então baixe o pacote da versão 2.0 do **Android Auto Desktop Head Unit Emulator**

![image](https://user-images.githubusercontent.com/83781823/169386850-86951c2d-7fcd-4d96-b8f3-5a3c84a0ac92.png)

O DHU é instalado no diretório `SDK_LOCATION/extras/google/auto/`. Depois que o download terminar, vocë pode voltar o canal de atualização de novo para o estável se não quiser usar o canal beta.

- Em sistemas Linux ou macOS, execute o seguinte comando para tornar o binario do emulador DHU um executável:

```shell
$ chmod +x ./desktop-head-unit
```

## Mudando o canal de atualização do Android Studio para beta<a name="mudar-canal"/>

Para mudar o canal de atualização do seu Android Studio siga esses passos:

- No Android Studio, selecione **File > Settings** (ou **Android Studio > Preference no Mac**)
- No painel esquerdo, selecione **Appearence & Behavior > System Settings > Updates**.
- Certifique-se que a opção de atualizações automáticas esteja marcada e então selecione o canal **Beta** do menu drop-down.
- Clique **Ok**.

![image](https://user-images.githubusercontent.com/83781823/169388205-d45da363-b090-4d4f-ac9a-f556918059d4.png)


## Rodando o DHU<a name="rodar-dhu"/>

Depois de instalar o DHU, você pode testar o seu app Android Auto conectando o seu dispositivo móvel na sua máquina via USB. Aqui vou mostrar como fazer usando USB Tunneling.

### Conectando no DHU usando USB Tunneling

Esse método requer uma conexão ao ao Android Auto head unit server via ADB. Siga esses passos para configurar o túnel para se conectar ao DHU:

1. Faça uma dessas opções para abrir as configurações do Android Auto, dependendo da versão do Android rodando no seu dispositivo:
   - No Android 10 ou superior: no dispositivo vá em **Configurações > Apps & Notifications > See all apps > Android Auto > Advanced > Additional settings in the app**.
   - No Android 9 ou inferior: no aplicativo do Android Auto, toque em **Menu**, depois em **Configurações**.
2. Role até a sessão **About** perto do final e toque em **Version** para ver todas as informações de versão e permissões.
3. Toque na sessão **Version and permissions info** 10 vezes.

   Uma caixa de diálogo deverá aparecer.
6. Toque em **Ok**.
   
   O modo de desenvolvimento estará ativado e você poderá acessar as opções de desenvolvedor no menu. Só é necessário habilitar o modo de desenvolvedor uma vez
5. Se o head unit server não estiver rodando, toque nos 3 pontos no canto superior direito da tela para abrir o menu e selecione **Start head unit server**

   No dispositivo, um serviço aparecerá na área de notificação que indica que o servidor está em execução.

   | ![image](https://user-images.githubusercontent.com/83781823/169395005-c38cc203-a4a1-4ac8-89d6-1b51f25a4219.png) | ![image](https://user-images.githubusercontent.com/83781823/169395019-4719d3e3-5d71-4c2b-9e00-b2851da0f89f.png) |
   | --- | --- |
   | Fig 1 | Fig 2 |
6. Conecte o dispositivo à máquina via USB
7. Certifique-se que o dispositivo esteja destravado
8. Na máquina, tode o seguinte comando:
   
   ```shell
   $ adb forward tcp:5277 tcp:5277
   ```
9. Inicie o DHU rodando `desktop-head-unit.exe` (**Windows**) ou `./desktop-head-unit` (no **macOS ou Linux**) a partir do diretório `SDK_LOCATION/extras/google/auto/`.

   ![image](https://user-images.githubusercontent.com/83781823/169397007-72b21210-94e4-4eaa-8587-7cb86bb89f7e.png)
10. Se for a primeira vez que estiver conectando o dispositivo móvel ao DHU, verifique a tela do telefone e aceita os termos do serviço.
