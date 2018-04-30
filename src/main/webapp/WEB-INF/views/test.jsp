<%@ page contentType="text/html;charset=UTF-8"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html"/>
    <title>Tree application.</title>

</head>
<body>
<h2>Welcome</h2>


<button id="send">send</button>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.1/jquery.min.js"></script>
<script>
    $(function () {
        function init() {
            // var markers = [{ "position": "113", "markerPosition": "23" },

            //     { "position": "12", "markerPosition": "19" },
            //     { "position": "11", "markerPosition": "12" }];
             var markers = { "position": "113", "markerPosition": "23" };
            //alert(JSON.stringify(markers));
            $.ajax({
                type: "POST",
                url: "/ss",
                contentType: "application/json",
                // The key needs to match your method's input parameter (case-sensitive).
                data: JSON.stringify(markers),
                dataType: 'json',
                success: function(data){alert(data);},
                failure: function(errMsg) {
                    alert(errMsg);
                }
            });
        }
        function init0() {
            // var markers = [{ "position": "113", "markerPosition": "23" },

            //     { "position": "12", "markerPosition": "19" },
            //     { "position": "11", "markerPosition": "12" }];
            var markers = { "position": "113", "markerPosition": "23" };
            alert(JSON.stringify(markers));
            $.ajax({
                type: "POST",
                url: "/ss1",
                contentType: "application/json",
                // The key needs to match your method's input parameter (case-sensitive).
                data: JSON.stringify(markers),
                dataType: 'json',
                success: function(data){alert(data);},
                failure: function(errMsg) {
                    alert(errMsg);
                }
            });
        }

        function init1() {
            var markers = [{ "position": "113", "markerPosition": "23" },
                { "position": "12", "markerPosition": "19" },
                { "position": "11", "markerPosition": "12" }];
            alert(JSON.stringify(markers));
            $.ajax({
                type: "POST",
                url: "/ss",
                contentType: "application/json",
                // The key needs to match your method's input parameter (case-sensitive).
                data: JSON.stringify(markers),
                dataType: 'json',
                success: function(data){alert(data);},
                failure: function(errMsg) {
                    alert(errMsg);
                }
            });
        }
        function init11() {
            var markers = [{ "position": "113", "markerPosition": "23" },
                { "position": "12", "markerPosition": "19" },
                { "position": "11", "markerPosition": "12" }];
            alert(JSON.stringify(markers));
            $.ajax({
                type: "POST",
                url: "/ss1",
                contentType: "application/json",
                // The key needs to match your method's input parameter (case-sensitive).
                data: JSON.stringify(markers),
                dataType: 'json',
                success: function(data){alert(data);},
                failure: function(errMsg) {
                    alert(errMsg);
                }
            });
        }
        function init2() {
            var markers = [{ "position": "113", "markerPosition": "23" },
                { "position": "12", "markerPosition": "19" },
                { "position": "11", "markerPosition": "12" }];
            alert(JSON.stringify(markers));
            $.ajax({
                type: "POST",
                url: "/ss",
                contentType: "application/json",
                // The key needs to match your method's input parameter (case-sensitive).
                data: JSON.stringify({markers : markers}),
                dataType: 'json',
                success: function(data){alert(data);},
                failure: function(errMsg) {
                    alert(errMsg);
                }
            });
        }
        function init21() {
            var markers = [{ "position": "113", "markerPosition": "23" },
                { "position": "12", "markerPosition": "19" },
                { "position": "11", "markerPosition": "12" }];
            alert(JSON.stringify(markers));
            $.ajax({
                type: "POST",
                url: "/ss1",
                contentType: "application/json",
                // The key needs to match your method's input parameter (case-sensitive).
                data: JSON.stringify({markers : markers}),
                dataType: 'json',
                success: function(data){alert(data);},
                failure: function(errMsg) {
                    alert(errMsg);
                }
            });
        }

        function init3() {

            $.ajax({
                url: "/sss",
                headers: {
                    Accept: "application/json; charset=utf-8",
                },
                // The key needs to match your method's input parameter (case-sensitive).
                dataType: 'json',
                success: function(data){alert(data);},
                failure: function(errMsg) {
                    alert(errMsg);
                }
            });

        }
        $('#send').on('click', function () {
            init3();
        });
        $('#send1').on('click', function () {
            init1();
        });
        $('#send2').on('click', function () {
            init2();
        });
        init();
        init0();
        init1();
        init11();
        init2();
        init21();

    });
</script>
</body>
</html>