(function(a,b){if(typeof define==="function"&&define.amd){define(["jquery","CodeMirror","nf"],function(e,c,d){b(e,c,d)})}else{if(typeof exports==="object"&&typeof module==="object"){b(require("jquery"),require("CodeMirror"),require("nf"))}else{b(a.$,a.CodeMirror,a.nf)}}}(this,function(h,f,d){var e=function(j){return typeof j==="undefined"};var a=function(j){return j===null};var i=function(j){return !e(j)&&!a(j)};var g=function(j){return e(j)||a(j)||j===""};var b=function(j){return typeof j==="function"};var c={init:function(j){return this.each(function(){if(e(j)||a(j)){return false}var o=j.languageMode;if(e(o)||a(o)){return false}var k=j.resizable===true;var s=j.sensitive===true;var r=i(j.content)?j.content:"";var t=h("<textarea></textarea>").text(r).appendTo(h(this));if(b(o.color)){f.commands.autocomplete=function(w){if(b(o.suggest)){f.showHint(w,o.suggest)}};f.defineMode(o.getLanguageId(),o.color);var u=j.readOnly===true;var q=f.fromTextArea(t.get(0),{mode:o.getLanguageId(),lineNumbers:true,matchBrackets:true,readOnly:u,extraKeys:{"Ctrl-Space":"autocomplete",Esc:function(w){if(b(j.escape)){j.escape()}},Enter:function(w){if(b(j.enter)){j.enter()}}}});var m=null;if(i(j.width)){m=j.width}var v=null;if(i(j.height)){v=j.height}q.setSize(m,v);h(this).data("editorInstance",q);var p=h(this).find(".CodeMirror");var l=p.find(".CodeMirror-code");if(k){p.append('<div class="ui-resizable-handle ui-resizable-se"></div>').resizable({handles:{se:".ui-resizable-se"},resize:function(){q.setSize(h(this).width(),h(this).height());q.refresh()}})}q.on("change",function(w,x){p.addClass("modified")});q.on("keyHandled",function(w,y,x){if(y==="Esc"){x.stopImmediatePropagation();x.preventDefault()}});if(s){l.addClass("sensitive");var n=function(w,x){if(l.hasClass("sensitive")){l.removeClass("sensitive");q.setValue("")}};q.on("mousedown",n);q.on("keydown",n)}if(i(j.minWidth)){p.resizable("option","minWidth",j.minWidth)}if(i(j.minHeight)){p.resizable("option","minHeight",j.minHeight)}}})},refresh:function(){return this.each(function(){var j=h(this).data("editorInstance");if(i(j)){j.refresh()}})},setSize:function(k,j){return this.each(function(){var l=h(this).data("editorInstance");if(i(l)){l.setSize(k,j)}})},setReadOnly:function(j){return this.each(function(){var k=h(this).data("editorInstance");if(i(k)){k.setOption("readOnly",j);if(j===false){h(this).find(".CodeMirror").removeClass("blank")}else{h(this).find(".CodeMirror").addClass("blank")}}})},getValue:function(){var j;this.each(function(){var k=h(this).data("editorInstance");if(i(k)){j=k.getValue()}return false});return j},setValue:function(j){return this.each(function(){var k=h(this).data("editorInstance");if(i(k)){k.setValue(j);h(this).find(".CodeMirror").removeClass("modified")}})},focus:function(){return this.each(function(){var j=h(this).data("editorInstance");if(i(j)){j.focus()}})},selectAll:function(){return this.each(function(){var j=h(this).data("editorInstance");if(i(j)){j.execCommand("selectAll")}})},isModified:function(){var j;this.each(function(){j=h(this).find(".CodeMirror").hasClass("modified");return false});return j},destroy:function(){return this.removeData("editorInstance").find(".CodeMirror").removeClass("modified")}};h.fn.nfeditor=function(j){if(c[j]){return c[j].apply(this,Array.prototype.slice.call(arguments,1))}else{return c.init.apply(this,arguments)}}}));