// Module /spa/
// Provides chat slider capability
var spa = (function () {
	
	// Module scope variables
	// Set contants
	var configMaps = {
		extended_height : 434,
		extended_title : 'Click to retract',
		retracted_height : 16,
		retracted_title : 'Click to extend',
		template_html : '<div class="spa-slider"><\/div>'
	};
	// Declare all other module scopre variables
	var $chatSlider, toggleSlider, onClickSlider, initModule;

	// DOM method /toggleslider/	
	// alternates slider height
	toggleSlider = function () {
		var slider_height = $chatSlider.height();
		if ( slider_height === configMaps.retracted_height ) {
			$chatSlider
				.animate({ height : configMaps.extended_height })
				.attr( 'title', configMaps.extended_title );
			return true;
		} else if ( slider_height === configMaps.extended_height ) {
			$chatSlider
				.animate({ height : configMaps.retracted_height })
				.attr( 'title', configMaps.retracted_title );
			return true;
		}
		return false;
	};

	initModule = function ( $container ) {
		spa.shell.initModule( $container );
	};

	return { initModule : initModule};
}());