// assets
import {
  AppstoreAddOutlined,
  AntDesignOutlined,
  BarcodeOutlined,
  BgColorsOutlined,
  FontSizeOutlined,
  LoadingOutlined
} from '@ant-design/icons';

// icons
const icons = {
  FontSizeOutlined,
  BgColorsOutlined,
  BarcodeOutlined,
  AntDesignOutlined,
  LoadingOutlined,
  AppstoreAddOutlined
};

// ==============================|| MENU ITEMS - UTILITIES ||============================== //

const stocks = {
  id: 'stocks',
  title: 'Stocks',
  type: 'group',
  children: [
    {
      id: 'stocks-bazin',
      title: 'Bazin',
      type: 'item',
      url: '/stocks/bazin',
      icon: icons.ProfileOutlined
    },
    {
      id: 'stocks-graham',
      title: 'Graham',
      type: 'item',
      url: '/stocks/graham',
      icon: icons.ProfileOutlined
    },
    {
      id: 'stocks-wacc',
      title: 'Wacc',
      type: 'item',
      url: '/stocks/wacc',
      icon: icons.ProfileOutlined
    },
    {
      id: 'stock',
      title: 'Stock',
      type: 'item',
      url: '/stock/select',
      icon: icons.ProfileOutlined
    },
    {
      id: 'stockGrid',
      title: 'Stock Grid',
      type: 'item',
      url: '/stocks/grid',
      icon: icons.ProfileOutlined
    }
  ]
};

export default stocks;
