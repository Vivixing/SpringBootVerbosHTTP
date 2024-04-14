# SpringBootVerbosHTTP
### URL Inicial del Proyecto

Este proyecto proporciona una API la cual se puede acceder desde esta URL: `http://localhost:8080/api/v1/`.

### Explicación Verbos

- **GET**

El método GET se utiliza para consultar u obtener datos de un recurso específico desde un servidor sin alterarlo, es decir, se emplea para recuperar información del servidor, pero no para modificarla.

- **POST**

El método POST se utiliza para enviar datos al servidor con el propósito de crear un nuevo recurso, es decir, que el cliente envía datos al servidor en el cuerpo de la solicitud, y el servidor procesa esos datos para crear un nuevo recurso según lo especificado por el cliente.

- **DELETE**

El método DELETE se utiliza para solicitar la eliminación de un recurso específico en el servidor, es decir, el cliente envía una solicitud al servidor indicando el recurso que se desea eliminar, generalmente identificado con un ID. El servidor procesa esta solicitud y elimina el recurso correspondiente si existe.

- **PATCH**

  El método PATCH se utiliza para realizar modificaciones parciales a un recurso existente en el servidor, es decir, el cliente envía al servidor solo los datos que deben ser modificados, el servidor procesa esta solicitud y realiza las modificaciones correspondientes al recurso.

- **PUT**

El método PUT se utiliza para actualizar un recurso existente en el servidor o para crear uno nuevo si no existe, es decir, el cliente envía al servidor una representación completa del recurso que se desea almacenar o actualizar.

- **HEAD**

El método HEAD se utiliza para solicitar solo las cabeceras de una respuesta HTTP, sin el cuerpo del mensaje, es decir, se pide información sobre el recurso solicitado, pero no se está interesado en los datos completos del recurso, solo en los metadatos que se encuentran en las cabeceras de la respuesta.

- **OPTIONS**

El método OPTIONS se utiliza para solicitar información sobre las opciones de comunicación disponibles para un recurso en particular en un servidor, es decir, preguntar al servidor qué métodos HTTP y cabeceras son permitidos para ese recurso en particular.
